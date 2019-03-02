package adapter;
//Client
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDataBase(); //Создаем адаптер

        //запускаем методы класса JavaApplication в переменной типа Database.
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
