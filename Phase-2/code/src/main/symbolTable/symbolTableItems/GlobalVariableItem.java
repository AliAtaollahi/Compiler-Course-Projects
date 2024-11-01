package main.symbolTable.symbolTableItems;

import main.ast.node.declaration.GlobVariableDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.type.Type;

public class GlobalVariableItem extends SymbolTableItem {

    protected Type type;
    protected GlobVariableDeclaration globVariableDeclaration;
    public static final String START_KEY = "global_";

    public GlobalVariableItem(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public GlobalVariableItem(GlobVariableDeclaration globVariableDeclaration)
    {
        this.name = globVariableDeclaration.getIdentifier().getName();
        this.type = globVariableDeclaration.getType();
        this.globVariableDeclaration = globVariableDeclaration;
    }

    public String getName() {
        return this.name;
    }
    
    public GlobVariableDeclaration getGlobVariableDeclaration()
    {
        return globVariableDeclaration;
    }

    public void setGlobVariableDeclaration(GlobVariableDeclaration globVariableDeclaration)
    {
        this.globVariableDeclaration = globVariableDeclaration;
    }
    
    public void setName(String name)
    {
        this.name = name;
        globVariableDeclaration.getIdentifier().setName(name);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public String getKey() {
        return GlobalVariableItem.START_KEY + this.name;
    }
}







