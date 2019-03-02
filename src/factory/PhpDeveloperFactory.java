package factory;

//реализация фабрики, реализуем метод так, чтоб он возвращал PhpDeveloper
public class PhpDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
