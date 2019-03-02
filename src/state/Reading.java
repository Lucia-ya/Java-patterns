package state;

/**
 * Реализация Activity - состояние - читать.
 */
public class Reading implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
    }
}
