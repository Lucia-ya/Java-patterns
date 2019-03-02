package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация Observed - класс, который уведомляет наблюдателей об изменениях
 */
public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>(); //коллекция с вакансиями
    List<Observer> subscribers = new ArrayList<>(); //коллекция с подписчиками

    public void addVacancy(String vacancy) { //добавить вакансию и уведомить об этом подписчиков
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) { //удалить вакансию и уведомить об этом подписчиков
        vacancies.remove(vacancy);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) { //добавить подписчика
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) { //удалить подписчика
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() { //вызывает у каждого подписчика метод handleEvent и передает коллекцию с вакансиями
        for (Observer subscriber : subscribers) {
            subscriber.handleEvent(vacancies);
        }

    }
}
