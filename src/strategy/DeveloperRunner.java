package strategy;
/**
 * Client
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        //Создаем разработчика
        Developer developer = new Developer();

        //Меняем ему активности и запускаем метод executeActivity()
        developer.setActivity(new Sleeping());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Coding());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();




    }
}
