package facade;

//в методе doJobBeforeDeadline принимает экземпляр BugTracker , и если спринт в работе - работает. Если нет - не работает
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading habrahabr");
        }

    }
}
