package observer;

import java.util.List;

/**
 * Реализация наблдателя с полем имя и конструктором для него
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) { //выводит строку с изменениями в вакансиями
        System.out.println("Dear " + name + ", we have some changes in vacancies: \n " + vacancies
        + "\n====================================================================\n");
    }


}
