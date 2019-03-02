package interpreter;

/**
 * Класс, описывающий AND выражение.
 * Принимает 2 экземпляра Expression, и проверяет что каждый из них в методе interpret(String context) возвращает true
 */
public class AndExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
