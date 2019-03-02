package state;

/**
 * Клиент
 */
public class DeveloperDay {
    public static void main(String[] args) {
        //создаем спящего разработчика
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());

        //меняем ему активности и смотрим что переход из активности в активность происходит в правильном порядке
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
