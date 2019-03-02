package interpreter;

import javax.swing.*;

/**
 * Client
 * Два статических метода  - для посика JavaCore и для поиска JavaEE разработчика, в которых мы назначаем слова, по
 * которым будет производиться поиск в резюме.
 */
public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println(isJava.interpret("JavaCore"));
        System.out.println(isJavaEE.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }
}
