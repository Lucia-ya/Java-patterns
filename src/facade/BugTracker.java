package facade;

//BugTracker - указывает, рабочий спринт активен или нет. Работает с другими класса на подобие флага
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active...");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is not active...");
        activeSprint = false;
    }
}
