package observer;

import java.util.List;

/**
 * Интерфейс наблюдателя, с методом который принимает в себя коллекцию строк с вакансиями
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
