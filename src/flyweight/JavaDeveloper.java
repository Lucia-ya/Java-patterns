package flyweight;

//реализация мелкого объекта по специальности
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("java developer writes Java code...");
    }
}
