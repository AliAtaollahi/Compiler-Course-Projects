package main.visitor.codeGenerator;

import main.compileError.name.MethodRedefinition;
import main.visitor.Visitor;
import main.ast.node.expression.operators.BinaryOperator;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import java.util.ArrayList;
import main.symbolTable.SymbolTable;
import main.symbolTable.symbolTableItems.*;
import main.ast.node.Program;
import main.ast.node.expression.values.*;
import main.ast.type.complexType.TradeType;
import main.ast.type.primitiveType.*;
import jdk.jshell.VarSnippet;
import main.visitor.typeAnalyzer.*;
import main.ast.node.statement.*;
import main.ast.type.Type;
import main.ast.type.complexType.OrderType;
import main.ast.node.expression.*;
import main.ast.node.expression.operators.UnaryOperator;
import main.compileError.CompileError;
import main.ast.node.declaration.*;


import java.io.*;

public class CodeGenerator extends Visitor<String> {
    TypeChecker expressionTypeChecker;
    private ArrayList<CompileError> typeErrors;
    private String outputPath;
    private FileWriter OutputFile;
    private FunctionDeclaration currentFunc;
    private int tempSlot = -1;
    private int lastLabel = 0;
    private int PrimitiveThreshold = 3;

    public CodeGenerator(ArrayList<CompileError> typeErrorsList) {
        typeErrors = typeErrorsList;
        this.expressionTypeChecker = new TypeChecker(typeErrors);
        this.setupOutputFolder();
    }

    public String computeSlotIndex(int index) {
        return (index <= PrimitiveThreshold) ? "_" + String.valueOf(index) : " " + String.valueOf(index);
    }

    private void insertDefaultValueStrForTypeAndExpression(Type type, Expression expression) {
        if (type instanceof IntType) visitExpression(expression);
        else if (type instanceof BoolType) visitExpression(expression);
        else if (type instanceof FloatType) visitExpression(expression);
        else if (type instanceof StringType) visitExpressionInStringType(expression);
        else appendStrToOutput(expression.accept(this));
    }

    private void visitExpressionInStringType(Expression expression) {
        appendStrToOutput(expression == null ? "ldc \"\"" : expression.accept(this));
    }

    private void visitExpression(Expression expression) {
        appendStrToOutput(expression == null ? "ldc 0" : expression.accept(this));
    }

    private void insertDefaultValueStrForArrayTypeAndLength(Type type, int length) {
        appendStrToOutput("ldc " + length);
        appendStrToOutput(type instanceof IntType ? "anewarray java/lang/Integer;" : 
                          type instanceof BoolType ? "anewarray java/lang/Boolean;" :
                          type instanceof FloatType ? "anewarray java/lang/Float;" :
                          type instanceof StringType ? "anewarray java/lang/String;" : "");
    }

    private String castToNonPrimitiveType(Type type) {
        if (type instanceof StringType)
            return "";
            
        type.isPrimitive = false;
        return type instanceof IntType ? "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;" :
               type instanceof BoolType ? "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;" : 
               type instanceof FloatType ? "invokestatic java/lang/Float/valueOf(F)Ljava/lang/Float;" : null;
    }

    private String castToPrimitiveType(Type type) {
        if (type instanceof StringType)
            return "";
        type.isPrimitive = true;

        return type instanceof IntType ? "invokevirtual java/lang/Integer/intValue()I" :
               type instanceof BoolType ? "invokevirtual java/lang/Boolean/booleanValue()Z" : 
               type instanceof FloatType ? "invokevirtual java/lang/Float/floatValue()F" : null;
    }

    private int findSlotOfIdentifier(String identifier) {
        if (identifier.equals("")) {
            if (tempSlot == -1) {
                int localVarsCount = 0;
                for (var localVar : currentFunc.getBody()) {
                    if (localVar instanceof VarDeclaration) {
                        localVarsCount += 1;
                    }
                }
                tempSlot = localVarsCount + currentFunc.getArgs().size();
            }
            tempSlot++;
            return tempSlot;
        }

        int i = 1;
        for (var arg : currentFunc.getArgs()) {
            if (arg.getIdentifier().getName().equals(identifier))
                return i;
            i++;
        }
        i = findNextSlotInStatements(currentFunc.getBody(), i, identifier);
        return i;
    }

    private int findNextSlotInStatements(ArrayList<Statement> statements, int i, String identifier) {
        for (var localVar : statements) {
            if (localVar instanceof VarDeclaration) {
                if (((VarDeclaration) localVar).getIdentifier().getName().equals(identifier))
                    return i;
                i++;
            }
            else if (localVar instanceof IfElseStmt) {
                int j = findNextSlotInStatements(((IfElseStmt) localVar).getThenBody(), i, identifier);
                int k = findNextSlotInStatements(((IfElseStmt) localVar).getElseBody(), i, identifier);
                if (j > 0)
                    return j;
                else if (k > 0)
                    return k;
            }
            else if (localVar instanceof WhileStmt) {
                int z = findNextSlotInStatements(((WhileStmt) localVar).getBody(), i, identifier);
                if (z > 0)
                    return z;
            }
        }
        return 0;
    }

    private void setupOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try {
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) { }
        duplicateFileToDestination(jasminPath, this.outputPath + "jasmin.jar");
        duplicateFileToDestination(listClassPath, this.outputPath + "List.j");
        duplicateFileToDestination(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void duplicateFileToDestination(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) { }
    }

    private void makeOutputFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.OutputFile = fileWriter;
        } catch (IOException e) {}
    }

    private void appendStrToOutput(String... buffer) {
        for (String str : buffer) {
            try {
                str = String.join("\n    ", str.split("\n"));
                this.OutputFile.write(str.startsWith("Label_") ? "  " + str + "\n" : 
                                      str.startsWith(".") ? str + "\n" :
                                      "    " + str + "\n");
                this.OutputFile.flush();
            } catch (IOException e) {}
        }
    }

    private String generateTypeSignature(Type type) {
        return type instanceof IntType ? "Ljava/lang/Integer;" :
               type instanceof BoolType ? "Ljava/lang/Boolean;" :
               type instanceof StringType ? "Ljava/lang/String;" : 
               type instanceof FloatType ? "Ljava/lang/Float;" :
               type instanceof NullType || type instanceof VoidType ? "V" : 
               type instanceof TradeType ? "LTrade;" : null;
    }

    public void processGlobalVariableDeclaration(Program program) {
        for (var varDeclaration : program.getVars()) {
            String buffer = "";
            buffer += ".field public " + varDeclaration.getIdentifier().getName() + " ";
            Type varType = varDeclaration.getType();
            if (varDeclaration.getLength() > 0)
                buffer += "[";
            buffer += generateTypeSignature(varType);
            appendStrToOutput(buffer);
            VariableItem varItem = new VariableItem(varDeclaration);
            try {
                SymbolTable.top.put(varItem);
            } catch (ItemAlreadyExistsException ignored) {};
        }
    }

    public void processGlobalVariablePutField(Program program) {
        for (var varDeclaration : program.getVars()) {
            String buffer = "";
            if (varDeclaration.getRValue() == null)
                return;
            buffer += "aload_0" + 
                    "\n" + varDeclaration.getRValue().accept(this);
            Type expType = varDeclaration.getRValue().accept(expressionTypeChecker);
            buffer += "\n" + castToNonPrimitiveType(expType) + "\n" + 
                    "putfield Main/" + varDeclaration.getIdentifier().getName() + " " + generateTypeSignature(varDeclaration.getType());
            appendStrToOutput(buffer);
        }
    }

    private String generateNewLabel() {
        String label = "Label_" + lastLabel;
        lastLabel++;
        return label;
    }

    public String handleFunctionCallOrders(FunctionCall functionCall) {
        String buffer = "";
        buffer += "new Order" + 
                  "\ndup" + 
                  "\nldc " + "\"" + ((TradeValue) functionCall.getArgs().get(0)).getConstant() + "\"" + "\n";
        Type argType = new IntType();
        buffer += functionCall.getArgs().get(1).accept(this);
        if (functionCall.getArgs().get(1).accept(expressionTypeChecker) instanceof FloatType)
            buffer += "\nf2i";
        argType.isPrimitive = true;
        buffer += "\n" + castToNonPrimitiveType(argType) +
                  "\n" + functionCall.getArgs().get(2).accept(this);
        if (functionCall.getArgs().get(2).accept(expressionTypeChecker) instanceof FloatType)
            buffer += "\nf2i";
        argType.isPrimitive = true;
        buffer += "\n" + castToNonPrimitiveType(argType) +
                  "\n" + functionCall.getArgs().get(3).accept(this);
        if (functionCall.getArgs().get(3).accept(expressionTypeChecker) instanceof FloatType)
            buffer += "\nf2i";
        argType.isPrimitive = true;
        buffer += "\n" + castToNonPrimitiveType(argType) + 
                  "\ninvokespecial Order/<init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V";
        return buffer;
    }

    private String generatePrimitiveTypeSignature(Type type) {
        return (type instanceof IntType) ? "I" :
               (type instanceof BoolType) ? "Z" :
               (type instanceof FloatType) ? "F" : null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator op = binaryExpression.getBinaryOperator();
        String buffer = "";
        Type leftType = binaryExpression.getLeft().accept(expressionTypeChecker);
        buffer += binaryExpression.getLeft().accept(this);
        buffer += "\n" + binaryExpression.getRight().accept(this);
        if (op == BinaryOperator.PLUS) buffer += (leftType instanceof FloatType) ? "\nfadd" : "\niadd";
        else if (op == BinaryOperator.MINUS) buffer += (leftType instanceof FloatType) ? "\nfsub" : "\nisub";
        else if (op == BinaryOperator.MULT) buffer += (leftType instanceof FloatType) ? "\nfmul" : "\nimul";
        else if (op == BinaryOperator.DIV) buffer += (leftType instanceof FloatType) ? "\nfdiv" : "\nidiv";
        else if (op == BinaryOperator.MOD) buffer += (leftType instanceof FloatType) ? "\nfrem" : "\nirem";
        else if (op == BinaryOperator.BIT_AND) buffer += "\niand";
        else if (op == BinaryOperator.BIT_OR) buffer += "\nior";
        else if (op == BinaryOperator.BIT_XOR) buffer += "\nixor";
        else if (op == BinaryOperator.L_SHIFT) buffer += "\nishl";
        else if (op == BinaryOperator.R_SHIFT) buffer += "\nishr";
        else if((op == BinaryOperator.GT) || (op == BinaryOperator.LT)) buffer = addCompareTokensTobuffer(buffer, op);
        else if((op == BinaryOperator.EQ) || (op == BinaryOperator.NEQ)) buffer = addEqualityTokensTobuffer(binaryExpression, buffer, op);
        else if (op == BinaryOperator.AND) buffer = addAndTokenTobuffer(binaryExpression);
        else if (op == BinaryOperator.OR) buffer = addOrTokenTobuffer(binaryExpression);
        else if (op == BinaryOperator.ASSIGN) buffer = addAssignTokenTobuffer(binaryExpression);
        else if ((op == BinaryOperator.ADD_ASSIGN) || (op == BinaryOperator.SUB_ASSIGN) || (op == BinaryOperator.MUL_ASSIGN) || (op == BinaryOperator.DIV_ASSIGN) || (op == BinaryOperator.MOD_ASSIGN)) buffer = addArithmaticTokensTobuffer(binaryExpression, op);
        return buffer;
    }

    private String addArithmaticTokensTobuffer(BinaryExpression binaryExpression, BinaryOperator op) {
        String buffer;
        buffer = "";
        String secondOperandStrs = binaryExpression.getRight().accept(this);
        if (binaryExpression.getLeft() instanceof ArrayIdentifier) {
            String name = ((ArrayIdentifier) binaryExpression.getLeft()).getName();
            buffer += "aload" + computeSlotIndex(findSlotOfIdentifier(name)) +
                      "\n" + ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this) +
                      "\naload" + computeSlotIndex(findSlotOfIdentifier(name)) +
                      "\n" + ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this) +
                      "\naaload" +
                      "\n" + castToPrimitiveType(new IntType()) +
                      "\n" + secondOperandStrs;
            buffer += (op == BinaryOperator.ADD_ASSIGN) ? "\niadd" :
                      (op == BinaryOperator.SUB_ASSIGN) ? "\nisub" :
                      (op == BinaryOperator.MUL_ASSIGN) ? "\nimul" :
                      (op == BinaryOperator.DIV_ASSIGN) ? "\nidiv" : "\nirem";

            String castCmd = castToNonPrimitiveType(new IntType());
            if (castCmd != null)
                buffer += "\n" + castCmd;
            buffer += "\naastore";
        }
        else if(binaryExpression.getLeft() instanceof Identifier) {
            String name = ((Identifier) binaryExpression.getLeft()).getName();
            buffer += "aload" + computeSlotIndex(findSlotOfIdentifier(name)) +
                        "\n" + castToPrimitiveType(new IntType()) +
                        "\n" + secondOperandStrs;
            buffer += (op == BinaryOperator.ADD_ASSIGN) ? "\niadd" :
                      (op == BinaryOperator.SUB_ASSIGN) ? "\nisub" :
                      (op == BinaryOperator.MUL_ASSIGN) ? "\nimul" :
                      (op == BinaryOperator.DIV_ASSIGN) ? "\nidiv" : "\nirem";
            String castCmd = castToNonPrimitiveType(new IntType());
            if (castCmd != null)
                buffer += "\n" + castCmd;
            buffer += "\nastore" + computeSlotIndex(findSlotOfIdentifier(name));
        }
        return buffer;
    }

    private String addAssignTokenTobuffer(BinaryExpression binaryExpression) {
        String buffer;
        buffer = "";
        Type firstType = binaryExpression.getLeft().accept(expressionTypeChecker);
        Type secondType = binaryExpression.getRight().accept(expressionTypeChecker);
        String secondOperandStrs = binaryExpression.getRight().accept(this);
        if (binaryExpression.getLeft() instanceof ArrayIdentifier) {
            String name = ((ArrayIdentifier) binaryExpression.getLeft()).getName();
            buffer += "aload" + computeSlotIndex(findSlotOfIdentifier(name)) +
                      "\n" + ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this) +
                      "\n" + secondOperandStrs;
            String castCmd = castToNonPrimitiveType(secondType);
            if (castCmd != null)
                buffer += "\n" + castCmd;
            buffer += "\naastore";
        }
        else if (binaryExpression.getLeft() instanceof Identifier) {
            String name = ((Identifier) binaryExpression.getLeft()).getName();
            buffer += secondOperandStrs;
            String castCmd = castToNonPrimitiveType(secondType);
            if (castCmd != null)
                buffer += "\n" + castCmd;
            buffer += "\nastore" + computeSlotIndex(findSlotOfIdentifier(name));
        }
        return buffer;
    }

    private String addOrTokenTobuffer(BinaryExpression binaryExpression) {
        String buffer;
        String trueLabel = generateNewLabel();
        String afterLabel = generateNewLabel();
        buffer = "; logical OR\n" +
                 binaryExpression.getLeft().accept(this) +
                 "\nifne " + trueLabel +
                 "\n" + binaryExpression.getRight().accept(this) +
                 "\nifne " + trueLabel +
                 "\nldc 0" +
                 "\ngoto " + afterLabel +
                 "\n" + trueLabel + ":" +
                 "\nldc 1" +
                 "\n" + afterLabel + ":";
        return buffer;
    }

    private String addAndTokenTobuffer(BinaryExpression binaryExpression) {
        String buffer;
        String shortCircuitLabel = generateNewLabel();
        String trueLabel = generateNewLabel();
        String afterLabel = generateNewLabel();
        buffer = "; logical AND\n" +
                 binaryExpression.getLeft().accept(this) +
                 "\nifeq " + shortCircuitLabel +
                 "\n" + binaryExpression.getRight().accept(this) +
                 "\nifne " + trueLabel +
                 "\n" + shortCircuitLabel + ":" +
                 "\nldc 0" +
                 "\ngoto " + afterLabel +
                 "\n" + trueLabel + ":" +
                 "\nldc 1" +
                 "\n" + afterLabel + ":";
        return buffer;
    }

    private String addEqualityTokensTobuffer(BinaryExpression binaryExpression, String buffer, BinaryOperator op) {
        String trueLabel = generateNewLabel();
        String afterLabel = generateNewLabel();
        String cmpStr = "if_a";
        Type type = binaryExpression.getLeft().accept(expressionTypeChecker);
        if (type instanceof IntType || type instanceof BoolType)
            cmpStr = "if_i";
        buffer += (op == BinaryOperator.EQ) ? "\n" + cmpStr + "cmpeq "  + trueLabel :
                                                    "\n" + cmpStr + "cmpne "  + trueLabel;
        buffer += "\nldc 0" +
                  "\ngoto " + afterLabel +
                  "\n" + trueLabel + ":" +
                  "\nldc 1" +
                  "\n" + afterLabel + ":";
        return buffer;
    }

    private String addCompareTokensTobuffer(String buffer, BinaryOperator op) {
        String trueLabel = generateNewLabel();
        String afterLabel = generateNewLabel();
        buffer += (op == BinaryOperator.GT) ? "\nif_icmpgt " + trueLabel :
                                                    "\nif_icmplt " + trueLabel;
        buffer += "\nldc 0" +
                  "\ngoto " + afterLabel +
                  "\n" + trueLabel + ":" +
                  "\nldc 1" +
                  "\n" + afterLabel + ":";
        return buffer;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        String buffer = "";
        UnaryOperator op = unaryExpression.getUnaryOperator();
        buffer += unaryExpression.getOperand().accept(this);
        if(op == UnaryOperator.MINUS) buffer += "\nineg";
        else if(op == UnaryOperator.NOT) buffer = addNotTokenTobuffer(buffer);
        else if((op == UnaryOperator.INC) || (op == UnaryOperator.DEC)) buffer = addIncDecTokensTobuffer(unaryExpression, buffer, op);
        return buffer;
    }

    private String addIncDecTokensTobuffer(UnaryExpression unaryExpression, String buffer, UnaryOperator op) {
        buffer += "\nldc 1";
        buffer += (op == UnaryOperator.INC) ? "\niadd" : "\nisub";

        if(unaryExpression.getOperand() instanceof Identifier) {
            int slot = findSlotOfIdentifier(((Identifier) unaryExpression.getOperand()).getName());
            buffer += "\n" + castToNonPrimitiveType(new IntType()) +
                        "\nastore" + computeSlotIndex(slot);
        }
        else if(unaryExpression.getOperand() instanceof ArrayIdentifier) {
            int tmpSlot = findSlotOfIdentifier("");
            buffer += "\n" + castToNonPrimitiveType(new IntType()) +
                      "\nastore" + computeSlotIndex(tmpSlot) +
                      "\n" + ((ArrayIdentifier) unaryExpression.getOperand()).getIndex().accept(this) +
                      "\naload" + computeSlotIndex(tmpSlot) +
                      "\n" + "invokevirtual List/setElement(ILjava/lang/Object;)V";
        }
        return buffer;
    }

    private String addNotTokenTobuffer(String buffer) {
        String trueLabel = generateNewLabel();
        String afterLabel = generateNewLabel();
        buffer += "\nifne " + trueLabel +
                  "\nldc 1" +
                  "\ngoto " + afterLabel +
                  "\n" + trueLabel + ":" +
                  "\nldc 0" +
                  "\n" + afterLabel + ":";
        return buffer;
    }


    @Override
    public String visit(PrintStmt print) {
        Type type = print.getExpr().accept(expressionTypeChecker);
        appendStrToOutput("; Print Statement " + print.getLine(),
                          "getstatic java/lang/System/out Ljava/io/PrintStream;",
                          print.getExpr().accept(this),
                          "invokevirtual java/io/PrintStream/print(" + generatePrimitiveTypeSignature(type) + ")V");
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(type instanceof NullType) {
            appendStrToOutput("return");
        }
        else {
            appendStrToOutput(returnStmt.getReturnedExpr().accept(this));
            appendStrToOutput(type instanceof IntType ? "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;" : 
                              type instanceof BoolType ? "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;" : 
                              type instanceof FloatType ? "invokestatic java/lang/Float/valueOf(F)Ljava/lang/Float;" : "");
            appendStrToOutput("areturn");
        }
        return null;
    }

    @Override
    public String visit(Identifier identifier) {
        String buffer = "";
        int slot = findSlotOfIdentifier(identifier.getName());
        buffer += "aload" + computeSlotIndex(slot);
        Type type = identifier.accept(expressionTypeChecker);
        String castCmd = castToPrimitiveType(type);
        if (castCmd != null && (!castCmd.equals("")))
            buffer += "\n" + castCmd;
        return buffer;
    }

    @Override
    public String visit(ArrayIdentifier arrayIdentifier) {
        String buffer = "";
        int slot = findSlotOfIdentifier(arrayIdentifier.getName());
        buffer += "aload" + computeSlotIndex(slot) +
                  "\n" + arrayIdentifier.getIndex().accept(this);
        Type type = arrayIdentifier.accept(expressionTypeChecker);
        if (type != null) {
            String castCmd = castToPrimitiveType(type);
            if (castCmd != null)
                buffer += "\n" + castCmd;
        }
        buffer += "\n" + "aaload";
        return buffer;
    }

    @Override
    public String visit(VarAccess varAccess) {
        String buffer = "";
        String tradeName = varAccess.getVariable().getName();
        buffer += "aload_1";
        buffer += tradeName.equals("Bid") ? "\ninvokevirtual LTrade/getBid()F" : 
                  tradeName.equals("Ask") ? "\ninvokevirtual LTrade/getAsk()F" :
                  tradeName.equals("Time") ? "\ninvokevirtual LTrade/getTime()F" :
                  tradeName.equals("High") ? "\ninvokevirtual LTrade/getHigh()F" :
                  tradeName.equals("Digits") ? "\ninvokevirtual LTrade/getDigits()I" :
                  tradeName.equals("Text") ? "\ninvokevirtual LTrade/getText()Ljava/lang/String" :
                  tradeName.equals("Volume") ? "\ninvokevirtual LTrade/getVolume()F" :
                  tradeName.equals("Type") ? "\ninvokevirtual LTrade/getType()I" :
                  tradeName.equals("Open") ? "\ninvokevirtual LTrade/getOpen()F" :
                  tradeName.equals("Low") ? "\ninvokevirtual LTrade/getLow()F" :
                  tradeName.equals("Close") ? "\ninvokevirtual LTrade/getClose()F" : "";
        return buffer;
    }

    @Override
    public String visit(NullValue nullValue) {
        String buffer = "";
        buffer += "aconst_null";
        return buffer;
    }

    @Override
    public String visit(IntValue intValue) {
        String buffer = "";
        buffer += "ldc " + String.valueOf(intValue.getConstant());
        return buffer;
    }

    @Override
    public String visit(FloatValue floatValue) {
        String buffer = "";
        buffer += "ldc " + String.valueOf(floatValue.getConstant());
        return buffer;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String buffer = "";
        buffer += "ldc ";
        buffer += boolValue.getConstant() ? "1" : "0";
        return buffer;
    }

    @Override
    public String visit(StringValue stringValue) {
        String buffer = "";
        buffer += "ldc " + stringValue.getConstant();
        return buffer;
    }

    @Override
    public String visit(ExpressionStmt expressionStmt) {
        appendStrToOutput(expressionStmt.getExpression().accept(this));
        return null;
    }

    @Override
    public String visit(FunctionCall functionCall) {
        String buffer = "";
        if (functionCall.getFunctionName().getName().equals("Order")) {
            buffer = handleFunctionCallOrders(functionCall);
            return buffer;
        }
        buffer += "aload_0";
        for (Expression arg : functionCall.getArgs()) {
            buffer += "\n" + arg.accept(this);
            Type argType = arg.accept(expressionTypeChecker);
            String castStr = castToNonPrimitiveType(argType);
            if (!castStr.equals(""))
                buffer += "\n" + castStr;
        }
        buffer += "\n" +
                  "invokevirtual LYourClass/" + functionCall.getFunctionName().getName() + "(";
        for (Expression arg : functionCall.getArgs())
            buffer += generateTypeSignature(arg.accept(expressionTypeChecker));
        buffer += ")" +
                  generateTypeSignature(functionCall.accept(expressionTypeChecker));
        return buffer;
    }    

    @Override
    public String visit(IfElseStmt ifElseStmt) {
        String elseLabel = generateNewLabel();
        String afterLabel = generateNewLabel();
        appendStrToOutput("Start If " + ifElseStmt.getLine(),
                          ifElseStmt.getCondition().accept(this),
                          "ifeq " + elseLabel);
        for (var thenStmt : ifElseStmt.getThenBody())
            thenStmt.accept(this);
        appendStrToOutput("goto " + afterLabel,
                          elseLabel + ":");
        if (ifElseStmt.getElseBody() != null)
            for (var elseStmt : ifElseStmt.getElseBody())
                elseStmt.accept(this);
        appendStrToOutput(afterLabel + ":");
        return null;
    }

    @Override
    public String visit(WhileStmt whileStmt) {
        String startLabel = generateNewLabel();
        String breakLabel = generateNewLabel();
        appendStrToOutput("Start While " + whileStmt.getLine(),
                          startLabel + ":",
                          whileStmt.getCondition().accept(this),
                          "ifeq " + breakLabel);
        for (var bodyStmt : whileStmt.getBody())
            bodyStmt.accept(this);
        appendStrToOutput("goto " + startLabel,
                          breakLabel + ":");
        return null;
    }

    @Override
    public String visit(VarDeclaration varDeclaration) {
        int slot = findSlotOfIdentifier(varDeclaration.getIdentifier().getName());
        Type varType = varDeclaration.getType();
        if (varDeclaration.getLength() == 0)
            insertDefaultValueStrForTypeAndExpression(varType, varDeclaration.getRValue());
        else
            insertDefaultValueStrForArrayTypeAndLength(varType, varDeclaration.getLength());
        appendStrToOutput("astore" + computeSlotIndex(slot));
        VariableItem varItem = new VariableItem(varDeclaration);
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExistsException ignored) {}
        return null;
    }

    @Override
    public String visit(AssignStmt assignStmt) {
        BinaryExpression assignExp = new BinaryExpression(assignStmt.getLValue(),
                assignStmt.getRValue(), assignStmt.getBinaryOperator());
        appendStrToOutput(assignExp.accept(this));
        return null;
    }


    @Override
    public String visit(MainDeclaration mainDeclaration) {
        appendStrToOutput(".method public main()V",
                          ".limit stack 128",
                          ".limit locals 128");
        MainItem mainItem = new MainItem(mainDeclaration);
        SymbolTable mainSymbolTable = new SymbolTable(SymbolTable.top, "main");
        mainItem.setMainSymbolTable(mainSymbolTable);
        SymbolTable.push(mainSymbolTable);
        for (var stmt : mainDeclaration.getBody()) {
            stmt.accept(this);
        }
        SymbolTable.pop();
        appendStrToOutput("return",
                          ".end method",
                          "\n");
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        String str = ".method public " + functionDeclaration.getName().getName();
        str += "(";
        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        try {
            SymbolTable.top.put(functionItem);
        } catch (ItemAlreadyExistsException ignored) {}
        SymbolTable funcSymbolTable = new SymbolTable(SymbolTable.top,  functionDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(funcSymbolTable);
        SymbolTable.push(funcSymbolTable);
        for (VarDeclaration arg : functionDeclaration.getArgs()) {
            str += generateTypeSignature(arg.getType());
            VariableItem varItem = new VariableItem(arg);
            try {
                SymbolTable.top.put(varItem);
            } catch (Exception ignored) {}
        }
        str += ")";
        str += generateTypeSignature(functionDeclaration.getReturnType());
        appendStrToOutput(str,
                          ".limit stack 128",
                          ".limit locals 128");

        for (var stmt : functionDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        if (functionDeclaration.getReturnType() instanceof VoidType)
            appendStrToOutput("return");
        appendStrToOutput(".end method",
                          "\n");
        return null;
    }

    @Override
    public String visit(OnStartDeclaration onStartDeclaration) {
        String str = ".method public " + "OnStart";
        str += "(";
        OnStartItem onStartItem = new OnStartItem(onStartDeclaration);
        try {
            SymbolTable.top.put(onStartItem);
        } catch (ItemAlreadyExistsException ignored) {}
        SymbolTable onStartSymbolTable = new SymbolTable(SymbolTable.top,  onStartDeclaration.getTradeName().getName());
        onStartItem.setOnStartSymbolTable(onStartSymbolTable);
        SymbolTable.push(onStartSymbolTable);
        str += "LTrade;";
        VarDeclaration initArg = new VarDeclaration();
        initArg.setIdentifier(onStartDeclaration.getTradeName());
        initArg.setType(new TradeType());
        VariableItem varItem = new VariableItem(initArg);
        try {
            SymbolTable.top.put(varItem);
        } catch (Exception ignored) {}
        str += ")";
        str += generateTypeSignature(new NullType());
        appendStrToOutput(str,
                          ".limit stack 128",
                          ".limit locals 128");
        for (var stmt : onStartDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        appendStrToOutput("return",
                          ".end method",
                          "\n");
        return null;
    }

    @Override
    public String visit(OnInitDeclaration onInitDeclaration) {
        String str = ".method public " + "OnInit";
        str += "(";
        OnInitItem onInitItem = new OnInitItem(onInitDeclaration);
        try {
            SymbolTable.top.put(onInitItem);
        } catch (ItemAlreadyExistsException ignored) {}
        SymbolTable onInitSymbolTable = new SymbolTable(SymbolTable.top,  onInitDeclaration.getTradeName().getName());
        onInitItem.setOnInitSymbolTable(onInitSymbolTable);
        SymbolTable.push(onInitSymbolTable);
        str += "LTrade;";
        VarDeclaration initArg = new VarDeclaration();
        initArg.setIdentifier(onInitDeclaration.getTradeName());
        initArg.setType(new TradeType());
        VariableItem varItem = new VariableItem(initArg);
        try {
            SymbolTable.top.put(varItem);
        } catch (Exception ignored) {}
        str += ")";
        str += generateTypeSignature(new NullType());
        appendStrToOutput(str,
                          ".limit stack 128",
                          ".limit locals 128");
        for (var stmt : onInitDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        appendStrToOutput("return",
                          ".end method",
                          "\n");
        return null;
    }
    
    public String visit(Program program) {
        makeOutputFile("Out");

        addNameOfSuperClass();

        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        processGlobalVariableDeclaration(program);
        processGlobalVariablePutField(program);
        addInit();

        visitFunctions(program);
        visitInits(program);
        visitStarts(program);
        visitMain(program);

        return null;
    }

    private void visitMain(Program program) {
        FunctionDeclaration mainFunc = new FunctionDeclaration();
        mainFunc.setArgs(new ArrayList<VarDeclaration>());
        mainFunc.setBody(program.getMain().getBody());
        currentFunc = mainFunc;
        program.getMain().accept(this);
    }

    private void visitStarts(Program program) {
        for (var onStart : program.getStarts()) {
            FunctionDeclaration onStartFunc = new FunctionDeclaration();
            VarDeclaration initArg = new VarDeclaration();
            initArg.setIdentifier(onStart.getTradeName());
            initArg.setType(new TradeType());
            var onStartArgs = new ArrayList<VarDeclaration>();
            onStartArgs.add(initArg);
            onStartFunc.setArgs(onStartArgs);
            onStartFunc.setBody(onStart.getBody());
            currentFunc = onStartFunc;
            onStart.accept(this);
        }
    }

    private void visitInits(Program program) {
        for (var onInit : program.getInits()) {
            FunctionDeclaration onInitFunc = new FunctionDeclaration();
            VarDeclaration initArg = new VarDeclaration();
            initArg.setIdentifier(onInit.getTradeName());
            initArg.setType(new TradeType());
            var onInitArgs = new ArrayList<VarDeclaration>();
            onInitArgs.add(initArg);
            onInitFunc.setArgs(onInitArgs);
            onInitFunc.setBody(onInit.getBody());
            currentFunc = onInitFunc;
            onInit.accept(this);
        }
    }

    private void visitFunctions(Program program) {
        for (var func : program.getFunctions()) {
            currentFunc = func;
            func.accept(this);
        }
    }

    private void addInit() {
        appendStrToOutput("\n",
                          ".method public <init>()V",
                          "aload_0",
                          "invokespecial java/lang/Object/<init>()V",
                          "return",
                          ".end method",
                          "\n");
    }

    private void addNameOfSuperClass() {
        appendStrToOutput(".class public UTL",
                          ".super java/lang/Object",
                          "\n");
    }

}
