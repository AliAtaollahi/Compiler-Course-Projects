package main.ast.node.statement;

import main.ast.node.expression.Expression;
import main.ast.node.expression.operators.BinaryOperator;
import main.visitor.IVisitor;

public class AssignStmt extends Statement {
    private Expression lValue;
    private Expression rValue;
    private BinaryOperator binaryOperator;

    public AssignStmt(Expression lValue, Expression rValue) {
        this.lValue = lValue;
        this.rValue = rValue;
    }

    public Expression getLValue() {
        return lValue;
    }

    public void setLValue(Expression lValue) {
        this.lValue = lValue;
    }

    public Expression getRValue() {
        return rValue;
    }

    public void setRValue(Expression rValue) {
        this.rValue = rValue;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }
    
    public void setBinaryOperator(BinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    @Override
    public String toString() {
        return "AssignStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
