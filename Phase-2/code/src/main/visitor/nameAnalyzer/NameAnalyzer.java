package main.visitor.nameAnalyzer;

import java.io.Console;
import java.util.ArrayList;

import main.ast.node.Program;
import main.ast.node.declaration.FunctionDeclaration;
import main.ast.node.declaration.GlobVariableDeclaration;
import main.ast.node.declaration.MainDeclaration;
import main.ast.node.declaration.OnInitDeclaration;
import main.ast.node.declaration.OnStartDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.node.statement.Statement;
import main.compileError.CompileError;
import main.compileError.name.FunctionVariableConflict;
import main.compileError.name.GlobalVariableRedefinition;
import main.compileError.name.IrregularDefenition;
import main.compileError.name.MethodRedefinition;
import main.compileError.name.PrimitiveFunctionRedefinition;
import main.compileError.name.VariableRedefinition;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.symbolTable.itemException.ItemNameExist;
import main.symbolTable.symbolTableItems.FunctionItem;
import main.symbolTable.symbolTableItems.GlobalVariableItem;
import main.symbolTable.symbolTableItems.MainItem;
import main.symbolTable.symbolTableItems.OnInitItem;
import main.symbolTable.symbolTableItems.OnStartItem;
import main.symbolTable.symbolTableItems.VariableItem;
import main.visitor.Visitor;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);
        visitAllGlobVariableDeclaration(program);
        visitAllFunctionDeclaration(program);
        visitAllOnInitDeclaration(program);
        visitAllOnStartDeclaration(program);
        visitAllProgramMainDeclaration(program);
        return null;
    }

    @Override
    public Void visit(OnInitDeclaration onInitDeclaration) {
        OnInitItem onInitItem = new OnInitItem(onInitDeclaration);
        checkPrimitiveFunctionRedefinitionOnVisitOninitDeclaration(onInitDeclaration, onInitItem);
        checkVariableRedefinitionOnVisitOninitDeclaration(onInitDeclaration, onInitItem);
        return null;
    }

    @Override
    public Void visit(OnStartDeclaration onStartDeclaration) {
        OnStartItem onStartItem = new OnStartItem(onStartDeclaration);
        checkPrimitiveFunctionRedefinitionOnVisitOnStartDeclaration(onStartDeclaration, onStartItem);
        checkVariableRedefinitionOnVisitOnStartDeclaration(onStartDeclaration, onStartItem);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        MainItem mainItem = new MainItem(mainDeclaration);
        checkMethodRedefinitionOnVisitMainDeclaration(mainDeclaration, mainItem);
        runAllVisitsInVisitMainDeclaration(mainDeclaration, mainItem);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        checkMethodRedefinitionOnVisitFunctionDeclaration(functionDeclaration, functionItem);
        checkFunctionVariableConflictOnVisitFunctionDeclaration(functionDeclaration, functionItem);
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        VariableItem variableItem = new VariableItem(varDeclaration);
        while (true) {
            try {
                SymbolTable.top.put(variableItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                RecordItemAlreadyExistsExceptionOnVisitVarDeclaration(varDeclaration, variableItem);
            } catch (ItemNameExist expBuiltIn) {
                RecordItemNameExistOnVisitVarDeclaration(varDeclaration, variableItem);
            }
        }
        return null;
    }

    @Override
    public Void visit(GlobVariableDeclaration globVariableDeclaration) {
        GlobalVariableItem globalVariableItem = new GlobalVariableItem(globVariableDeclaration);
        while (true) {
            try {
                SymbolTable.top.put(globalVariableItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                recordItemAlreadyExistsExceptionOnVisitGlobVariableDeclaration(globVariableDeclaration, globalVariableItem);
            } catch (ItemNameExist expBuiltIn) {
                recordItemNameExistOnVisitGlobVariableDeclaration(globVariableDeclaration, globalVariableItem);
            }
        }
        return null;
    }

    private void visitAllProgramMainDeclaration(Program program) {
        program.getMain().accept(this);
    }

    private void visitAllOnStartDeclaration(Program program) {
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
    }

    private void visitAllOnInitDeclaration(Program program) {
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
    }

    private void visitAllFunctionDeclaration(Program program) {
        for (FunctionDeclaration functionDeclaration : program.getFunctions()) {
            for (GlobVariableDeclaration globVariableDeclaration : program.getVars()) {
                if (functionDeclaration.getName().getName().equals(globVariableDeclaration.getIdentifier().getName())) {
                    nameErrors.add(new FunctionVariableConflict(functionDeclaration.getLine(), functionDeclaration.getName().getName()));
                }
            }
            functionDeclaration.accept(this);
        }
    }

    private void visitAllGlobVariableDeclaration(Program program) {
        for (GlobVariableDeclaration globVariableDeclaration : program.getVars())
            globVariableDeclaration.accept(this);
    }

    private void checkVariableRedefinitionOnVisitOninitDeclaration(OnInitDeclaration onInitDeclaration, OnInitItem onInitItem) {
        SymbolTable onInitSymbolTable = new SymbolTable(SymbolTable.top, onInitDeclaration.getTradeName().getName());
        onInitItem.setOnInitSymbolTable(onInitSymbolTable);
        SymbolTable.push(onInitSymbolTable);
        for (var statement: onInitDeclaration.getBody()) {
            if (statement instanceof VarDeclaration varDeclaration) {
                VariableItem variableItem = new VariableItem(varDeclaration);
                if (variableItem.getName().equals(onInitDeclaration.getTradeName().getName())) {
                    nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), variableItem.getName()));
                }
            }
            statement.accept(this);
        }
        SymbolTable.pop();
    }

    private void checkPrimitiveFunctionRedefinitionOnVisitOninitDeclaration(OnInitDeclaration onInitDeclaration, OnInitItem onInitItem) {
        while (true) {
            try {
                SymbolTable.top.put(onInitItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!onInitItem.getName().endsWith("!")) {
                    nameErrors.add(new PrimitiveFunctionRedefinition(onInitDeclaration.getLine(), onInitDeclaration.getTradeName().getName()));
                }
                onInitItem.setName(onInitItem.getName() + "!");
            } catch (Exception ignored) {}
        }
    }

    private void checkVariableRedefinitionOnVisitOnStartDeclaration(OnStartDeclaration onStartDeclaration, OnStartItem onStartItem) {
        SymbolTable onStartSymbolTable = new SymbolTable(SymbolTable.top, onStartDeclaration.getTradeName().getName());
        onStartItem.setOnStartSymbolTable(onStartSymbolTable);
        SymbolTable.push(onStartSymbolTable);
        for (var statement: onStartDeclaration.getBody()) {
            if (statement instanceof VarDeclaration varDeclaration) {
                VariableItem variableItem = new VariableItem(varDeclaration);
                if (variableItem.getName().equals(onStartDeclaration.getTradeName().getName())) {
                    nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), variableItem.getName()));
                }
            }
            statement.accept(this);
        }
        SymbolTable.pop();
    }

    private void checkPrimitiveFunctionRedefinitionOnVisitOnStartDeclaration(OnStartDeclaration onStartDeclaration, OnStartItem onStartItem) {
        while (true) {
            try {
                SymbolTable.top.put(onStartItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!onStartItem.getName().endsWith("!")) {
                    nameErrors.add(new PrimitiveFunctionRedefinition(onStartDeclaration.getLine(), onStartDeclaration.getTradeName().getName()));
                }
                onStartItem.setName(onStartItem.getName() + "!");
            } catch (Exception ignored) {}
        }
    }

    private void runAllVisitsInVisitMainDeclaration(MainDeclaration mainDeclaration, MainItem mainItem) {
        SymbolTable mainSymbolTable = new SymbolTable(SymbolTable.top, mainItem.getName());
        mainItem.setMainSymbolTable(mainSymbolTable);
        SymbolTable.push(mainSymbolTable);
        for (var statement: mainDeclaration.getBody()) {
            statement.accept(this);
        }
        for (VarDeclaration tradeStm: mainDeclaration.getMainTrades()) {
            visitTradeStatementcheckVariableRedefinitionOnVisitOninitDeclaration(tradeStm);
        }
        SymbolTable.pop();
    }

    private void visitTradeStatementcheckVariableRedefinitionOnVisitOninitDeclaration(VarDeclaration tradeStm) {
        tradeStm.accept(this);
    }

    private void checkMethodRedefinitionOnVisitMainDeclaration(MainDeclaration mainDeclaration, MainItem mainItem) {
        while (true) {
            try {
                SymbolTable.top.put(mainItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!mainItem.getName().endsWith("!")) {
                    nameErrors.add(new MethodRedefinition(mainDeclaration.getLine(), mainItem.getName()));
                }
                mainItem.setName(mainItem.getName() + "!");
            } catch (Exception ignored) {}
        }
    }

    private void checkFunctionVariableConflictOnVisitFunctionDeclaration(FunctionDeclaration functionDeclaration, FunctionItem functionItem) {
        SymbolTable functionSymbolTable = new SymbolTable(SymbolTable.top, functionItem.getName());
        functionItem.setHandlerSymbolTable(functionSymbolTable);
        SymbolTable.push(functionSymbolTable);
        for (VarDeclaration arg: functionDeclaration.getArgs()) {
            visitTradeStatementcheckVariableRedefinitionOnVisitOninitDeclaration(arg);
        }
        for (var statement: functionDeclaration.getBody()) {
            if (statement instanceof VarDeclaration varDeclaration) {
                VariableItem variableItem = new VariableItem(varDeclaration);
                if (variableItem.getName().equals(functionItem.getName())) {
                    nameErrors.add(new FunctionVariableConflict(varDeclaration.getLine(), variableItem.getName()));
                }
            }
            statement.accept(this);
        }
        SymbolTable.pop();
    }

    private void checkMethodRedefinitionOnVisitFunctionDeclaration(FunctionDeclaration functionDeclaration, FunctionItem functionItem) {
        while (true) {
            try {
                SymbolTable.top.put(functionItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!functionItem.getName().endsWith("!")) {
                    nameErrors.add(new MethodRedefinition(functionDeclaration.getLine(), functionItem.getName()));
                }
                functionItem.setName(functionItem.getName() + "!");
            } catch (Exception ignored) {}
        }
    }

    private void RecordItemNameExistOnVisitVarDeclaration(VarDeclaration varDeclaration, VariableItem variableItem) {
        if (!variableItem.getName().endsWith("!")) {
            nameErrors.add(new IrregularDefenition(varDeclaration.getLine(), variableItem.getName()));
        }
        variableItem.setName(variableItem.getName() + "!");
    }

    private void RecordItemAlreadyExistsExceptionOnVisitVarDeclaration(VarDeclaration varDeclaration, VariableItem variableItem) {
        if (!variableItem.getName().endsWith("!")) {
            nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), variableItem.getName()));
        }
        variableItem.setName(variableItem.getName() + "!");
    }

    private void recordItemNameExistOnVisitGlobVariableDeclaration(GlobVariableDeclaration globVariableDeclaration, GlobalVariableItem globalVariableItem) {
        if (!globalVariableItem.getName().endsWith("!")) {
            nameErrors.add(new IrregularDefenition(globVariableDeclaration.getLine(), globalVariableItem.getName()));
        }
        globalVariableItem.setName(globalVariableItem.getName() + "!");
    }

    private void recordItemAlreadyExistsExceptionOnVisitGlobVariableDeclaration(GlobVariableDeclaration globVariableDeclaration, GlobalVariableItem globalVariableItem) {
        if (!globalVariableItem.getName().endsWith("!")) {
            nameErrors.add(new GlobalVariableRedefinition(globVariableDeclaration.getLine(), globalVariableItem.getName()));
        }
        globalVariableItem.setName(globalVariableItem.getName() + "!");
    }
}

