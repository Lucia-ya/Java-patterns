package observer;

/**
 * Clent
 */
public class JobSearch {
    public static void main(String[] args) {
        //Создать сайт и добавить туда несколько вакансий
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");
        jobSite.addVacancy("Third java position");

        //создаем подписчиков
        Subscriber subscriber1 = new Subscriber("Lucia");
        Subscriber subscriber2 = new Subscriber("S1");

        //добавляем подписчиков в коллекцию сайта
        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        //добавляем и удаляем вакансии и смотрим что все приходят уведомления
        jobSite.addVacancy("java positions");
        jobSite.removeVacancy("java positions");
    }
}
