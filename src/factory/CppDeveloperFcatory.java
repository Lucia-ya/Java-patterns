package factory;

//реализуем фабрику, реализуем метод так, чтоб он возвращал CppDeveloper
public class CppDeveloperFcatory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
