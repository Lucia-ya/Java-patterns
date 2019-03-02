package factory;

//Реализация интерфейса Developer

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() { //реализуем метод интерфейса
        System.out.println("java developer writes Java code...");
    }
}
