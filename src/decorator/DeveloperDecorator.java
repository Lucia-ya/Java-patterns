package decorator;

//Decorator - в методе makeJob вызывает метод разработчика, которого передали в конструкторе
public class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
