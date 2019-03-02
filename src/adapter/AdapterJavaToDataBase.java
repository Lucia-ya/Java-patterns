package adapter;

//Адаптер - наследуемся и имплементируем те классы, работу которых надо соеденить
//и м методах интерфейса, высываем методы родителя.
public class AdapterJavaToDataBase extends JavaApplication implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
