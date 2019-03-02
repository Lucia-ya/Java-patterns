package iterator;

/**
 * Интерфейс с самого итератора.
 */
public interface Iterator {
    public boolean hasNext(); //возвращает true если есть еще объекты в коллекции

    public Object next(); //возвращает следующий объект в коллекции
}
