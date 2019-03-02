package visitor;

/**
 * Created by Люсия on 02.03.2019.
 */
public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
