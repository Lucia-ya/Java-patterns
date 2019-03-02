package factory;

//реализация Developer, реализуем метод так, чтоб он возвращал строку исходя из специальности
public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}
