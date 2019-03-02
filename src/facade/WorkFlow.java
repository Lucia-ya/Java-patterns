package facade;

//Фасад - компоновка всех элементов - организация взаимодействия между ними
public class WorkFlow {
    //Создание всех элементов, работу которых необходимо компоновать
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    //метод, который компонует работу элементов
    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }



}
