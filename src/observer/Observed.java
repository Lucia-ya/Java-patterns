package observer;

/**
 * Интерфейс класса, изменения в котором и будут наблюдать реализации интерфейса Observer
 */
public interface Observed {
    public void addObserver(Observer observer); //добавить наблюдателя

    public void removeObserver(Observer observer); //удалить наблюдателя

    public void notifyObservers(); //уведомить всех наблюдателей об изменениях
}
