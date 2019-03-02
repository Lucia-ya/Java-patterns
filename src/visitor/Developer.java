package visitor;

/**
 * Интерфейс для создания разработчиков
 */
public interface Developer {
    public void create(ProjectClass projectClass); //создать классы

    public void create(Database database); //создать БД

    public void create(Test test); //создать тесты.
}
