package main.ast.node;

import main.ast.node.declaration.*;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Program extends Node{
    private ArrayList<GlobVariableDeclaration> vars = new ArrayList<>();
    private ArrayList<OnInitDeclaration> inits = new ArrayList<>();
    private ArrayList<OnStartDeclaration> starts = new ArrayList<>();
    private ArrayList<FunctionDeclaration> functions = new ArrayList<>();
    private MainDeclaration programMainDeclaration;

    public MainDeclaration getMain() {
        return this.programMainDeclaration;
    }

    public void setMain(MainDeclaration mainDeclarationActors) {
        this.programMainDeclaration = mainDeclarationActors;
    }

    public ArrayList<GlobVariableDeclaration> getVars() {
        return vars;
    }

    public void setVars(ArrayList<GlobVariableDeclaration> vars) {
        this.vars = vars;
    }

    public ArrayList<OnInitDeclaration> getInits() {
        return inits;
    }

    public void setInits(ArrayList<OnInitDeclaration> inits) {
        this.inits = inits;
    }

    public ArrayList<OnStartDeclaration> getStarts() {
        return starts;
    }

    public void setStarts(ArrayList<OnStartDeclaration> starts) {
        this.starts = starts;
    }

    public ArrayList<FunctionDeclaration> getFunctions() {
        return functions;
    }

    public void setFunctions(ArrayList<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public void addVar(GlobVariableDeclaration globVariableDeclaration) {
        this.vars.add(globVariableDeclaration);
    }

    public void addInit(OnInitDeclaration onInitDeclaration) {
        this.inits.add(onInitDeclaration);
    }

    public void addStart(OnStartDeclaration onStartDeclaration) {
        this.starts.add(onStartDeclaration);
    }

    public void addFunction(FunctionDeclaration functionDeclaration) {
        this.functions.add(functionDeclaration);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
