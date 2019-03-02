package interpreter;

/**
 * Интерфейс для реализаций логических выражений для заданной задачи. Который в методе возвращает true или false.
 */
public interface Expression {
    public boolean interpret(String context);
}
