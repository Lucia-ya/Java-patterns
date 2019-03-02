package strategy;

/**
 * Реализация Activity - состояние - писать код.
 */
public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Writting code...");
    }
}
