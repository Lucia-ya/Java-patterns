package factory;

//реализуем фабрику, реализуем метод так, чтоб он возвращал JavaDeveloper
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
