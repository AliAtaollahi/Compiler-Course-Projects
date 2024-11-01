package main.ast.node.expression.values;

import main.visitor.IVisitor;

public class NullValue extends Value {
    private Object constant;

    public NullValue() {
        this.constant = null;
    }

    public Object getConstant() {
        return null;
    }

//    public void setConstant(boolean constant) {
//        this.constant = constant;
//    }

    @Override
    public String toString(){
        return "NullValue";

    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}