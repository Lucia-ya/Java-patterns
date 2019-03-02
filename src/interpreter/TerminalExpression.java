package interpreter;

/**
 * Терминальные выражения
 * Принимает в конструкторе строку, и в методе interpret(String context) проверяет содержит ли передаваемая в аргумете
 * строка, строку которую передали в конструкторе
 */
public class TerminalExpression implements Expression{
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }


    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
