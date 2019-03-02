package decorator;

//реализация Developer и метода makeJob() исходя из специализации разработчика - Java
public class JavaDeveloper implements Developer {

    @Override
    public String makeJob() {
        return "Java developer make Java...";
    }
}
