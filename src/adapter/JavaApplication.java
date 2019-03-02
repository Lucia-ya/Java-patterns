package adapter;

//управляет объектами в программе - методы делают то же самое что и в Database
public class JavaApplication {
    public void saveObject() {
        System.out.println("Save object...");
    }

    public void updateObject() {
        System.out.println("Update object");
    }

    public void loadObject() {
        System.out.println("Load object...");
    }

    public void deleteObject() {
        System.out.println("Delete object...");
    }
}
