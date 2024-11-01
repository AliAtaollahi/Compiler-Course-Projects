package main.visitor.astPrinter;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.expression.*;
import main.ast.node.expression.values.*;
import main.ast.node.statement.*;
import main.visitor.Visitor;

public class ASTPrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line:" + line + ":" + getClassName(message));
    }

    public String getClassName(String input) {
        int lastDotIndex = input.lastIndexOf('.');
        if (lastDotIndex == -1) {
            return input;
        }
        return input.substring(lastDotIndex + 1);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.getClass().getName());
        for (GlobVariableDeclaration globVariableDeclaration : program.getVars())
            globVariableDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration : program.getFunctions())
            functionDeclaration.accept(this);
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        messagePrinter(mainDeclaration.getLine(), mainDeclaration.getClass().getName());
        for (var stm : mainDeclaration.getBody()) {
            stm.accept(this);
        }
        for (var tradeStm : mainDeclaration.getMainTrades()) {
            tradeStm.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(OnInitDeclaration onInitDeclaration) {
        messagePrinter(onInitDeclaration.getLine(), onInitDeclaration.getClass().getName());
        onInitDeclaration.getTradeName().accept(this);
        for (var stm : onInitDeclaration.getBody()) {
            stm.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(OnStartDeclaration onStartDeclaration) {
        messagePrinter(onStartDeclaration.getLine(), onStartDeclaration.getClass().getName());
        onStartDeclaration.getTradeName().accept(this);
        for (var stm : onStartDeclaration.getBody()) {
            stm.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        messagePrinter(functionDeclaration.getLine(), functionDeclaration.getClass().getName());
        for (var arg : functionDeclaration.getArgs()) {
            arg.accept(this);
        }
        for (var stm : functionDeclaration.getBody()) {
            stm.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration){
        messagePrinter(varDeclaration.getLine(), varDeclaration.getClass().getName()
        + " " + varDeclaration.getIdentifier().getName());
        if (varDeclaration.getExpression() != null) {
            varDeclaration.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(GlobVariableDeclaration globVariableDeclaration){
        messagePrinter(globVariableDeclaration.getLine(), "VarDeclaration " +
                globVariableDeclaration.getIdentifier().getName());
        if (globVariableDeclaration.getExpression() != null) {
            globVariableDeclaration.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        messagePrinter(assignStmt.getLine(), assignStmt.getClass().getName());
        if (assignStmt.getLValue() != null) {
            assignStmt.getLValue().accept(this);
        }
        if (assignStmt.getRValue() != null) {
            assignStmt.getRValue().accept(this);
        }
        return null;
    }

    @Override
    public  Void visit(ContinueBreakStmt continueBreakStmt) {
        messagePrinter(continueBreakStmt.getLine(), continueBreakStmt.getClass().getName()
        + " " + continueBreakStmt.getToken());
        return null;
    }

    @Override
    public Void visit(ExpressionStmt expressionStmt) {
        if (expressionStmt.getExpression() != null) {
            expressionStmt.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        messagePrinter(forStmt.getLine(), forStmt.getClass().getName());
        for (var init : forStmt.getInit()) {
            init.accept(this);
        }
        if (forStmt.getCondition() != null) {
            forStmt.getCondition().accept(this);
        }
        if (forStmt.getUpdate() != null) {
            forStmt.getUpdate().accept(this);
        }
        for (var stm : forStmt.getBody()) {
            stm.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(IfElseStmt conditional) {
        messagePrinter(conditional.getLine(), conditional.getClass().getName());
        if (conditional.getCondition() != null) {
            conditional.getCondition().accept(this);
        }
        for (var stm : conditional.getThenBody()) {
            stm.accept(this);
        }
        for (var stm : conditional.getElseBody()) {
            stm.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        messagePrinter(returnStmt.getLine(), returnStmt.getClass().getName());
        if (returnStmt.getReturnedExpr() != null) {
            returnStmt.getReturnedExpr().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ThrowStmt throwStmt) {
        messagePrinter(throwStmt.getLine(), throwStmt.getClass().getName());
        if (throwStmt.getReturnedExpr() != null) {
            throwStmt.getReturnedExpr().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(TryCatchStmt tryCatchStmt) {
        messagePrinter(tryCatchStmt.getLine(), tryCatchStmt.getClass().getName());
        for (var stm : tryCatchStmt.getTryBody()) {
            stm.accept(this);
        }
        for (var stm : tryCatchStmt.getCatchBody()) {
            stm.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(WhileStmt whileStmt) {
        messagePrinter(whileStmt.getLine(), whileStmt.getClass().getName());
        if (whileStmt.getCondition() != null) {
            whileStmt.getCondition().accept(this);
        }
        for (var stm : whileStmt.getBody()) {
            stm.accept(this);
        }
        return null;
    }


    @Override
    public Void visit (TradeValue value) {
        messagePrinter(value.getLine(), value.getClass().getName() + " " + value.getConstant());
        return null;
    }

    @Override
    public Void visit (UnaryExpression unaryExpression) {
        messagePrinter(unaryExpression.getLine(), unaryExpression.getClass().getName()
        + " " + unaryExpression.getUnaryOperator().name());
        if (unaryExpression.getOperand() != null) {
            unaryExpression.getOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit (BinaryExpression binaryExpression) {
        messagePrinter(binaryExpression.getLine(), binaryExpression.getClass().getName()
        + " " + binaryExpression.getBinaryOperator().name());
        if (binaryExpression.getLeft() != null) {
            binaryExpression.getLeft().accept(this);
        }
        if (binaryExpression.getRight() != null) {
            binaryExpression.getRight().accept(this);
        }
        return null;
    }

    @Override
    public Void visit (VarAccess varAccess) {
        messagePrinter(varAccess.getLine(), varAccess.getClass().getName());
        if (varAccess.getInstance() != null) {
            varAccess.getInstance().accept(this);
        }
        if (varAccess.getVariable() != null) {
            varAccess.getVariable().accept(this);
        }
        return null;
    }

    @Override
    public Void visit (Identifier identifier) {
        messagePrinter(identifier.getLine(), identifier.getClass().getName() + " " + identifier.getName());
        return null;
    }

    @Override
    public Void visit (ArrayIdentifier arrayIdentifier) {
        messagePrinter(arrayIdentifier.getLine(), arrayIdentifier.getClass().getName()
        + " " + arrayIdentifier.getName());
        if (arrayIdentifier.getIndex() != null) {
            arrayIdentifier.getIndex().accept(this);
        }
        return null;
    }

    @Override
    public Void visit (IntValue value) {
        messagePrinter(value.getLine(), value.getClass().getName());
        return null;
    }

    @Override
    public Void visit (StringValue value) {
        messagePrinter(value.getLine(), value.getClass().getName());
        return null;
    }
    
    @Override
    public Void visit (BoolValue boolValue) {
        messagePrinter(boolValue.getLine(), boolValue.getClass().getName());
        return null;
    }

    @Override
    public Void visit (FloatValue floatValue) {
        messagePrinter(floatValue.getLine(), floatValue.getClass().getName());
        return null;
    }

    @Override
    public Void visit (FunctionCall functionCall) {
        messagePrinter(functionCall.getLine(), functionCall.getClass().getName());
        if (functionCall.getFunctionName() != null) {
            functionCall.getFunctionName().accept(this);
        }
        for (var args : functionCall.getArgs()) {
            args.accept(this);
        }
        return null;
    }

    @Override
    public Void visit (MethodCall methodCall) {
        messagePrinter(methodCall.getLine(), methodCall.getClass().getName());
        if (methodCall.getIdentifierName() != null) {
            methodCall.getIdentifierName().accept(this);
        }
        if (methodCall.getFunctionName() != null) {
            methodCall.getFunctionName().accept(this);
        }
        if (methodCall.getInstance() != null) {
            methodCall.getInstance().accept(this);
        }
        for (var args : methodCall.getArgs()) {
            args.accept(this);
        }
        return null;
    }

}

