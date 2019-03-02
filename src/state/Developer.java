package state;

/**
 * Разработчик, с полем activity и сеттером для него
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() { //меням активность в зависимости от текущей активности
        if (activity instanceof Sleeping) {
            setActivity(new Training());
        } else if (activity instanceof Training) {
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        }
    }

    public void justDoIt() { //вызываем метод justDoIt() у текущей активности
        activity.justDoIt();
    }
}
