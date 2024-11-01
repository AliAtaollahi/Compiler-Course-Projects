package main.ast.node.statement;
import main.ast.node.expression.Expression;
import main.visitor.IVisitor;
public class PrintStmt extends Statement{
    private Expression expr;

    public PrintStmt(Expression expr) {
        this.expr = expr;
    }

    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "PrintStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}