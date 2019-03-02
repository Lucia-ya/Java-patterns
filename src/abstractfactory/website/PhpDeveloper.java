package abstractfactory.website;

import abstractfactory.Developer;
//реализуем интерфейс developer, чтоб он в методе writeCode() возвращал работу Web Php разрабочика
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}
