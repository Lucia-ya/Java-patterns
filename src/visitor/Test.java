package visitor;

/**
 * Created by Люсия on 02.03.2019.
 */
public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
