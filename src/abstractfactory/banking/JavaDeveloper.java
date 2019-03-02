package abstractfactory.banking;

import abstractfactory.Developer;

//реализуем интерфейс developer, чтоб он в методе writeCode() возвращал работу банковского Java разрабочика
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
