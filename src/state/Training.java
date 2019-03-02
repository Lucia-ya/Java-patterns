package state;

/**
 * Реализация Activity - состояние - тренироваться.
 */
public class Training implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training...");
    }
}
