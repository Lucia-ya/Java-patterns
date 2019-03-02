package strategy;

/**
 * Реализация Activity - состояние - спать.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
