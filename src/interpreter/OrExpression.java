package interpreter;

/**
 * Класс, описывающий OR выражение.
 * Принимает 2 экземпляра Expression, и проверяет хотя бы один из них в методе interpret(String context) возвращает true
 */
public class OrExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
