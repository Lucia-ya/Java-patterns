package adapter;

//Интерфейс с операциями базы данных
public interface Database {
    public void insert();

    public void update();

    public void select();

    public void remove();
}
