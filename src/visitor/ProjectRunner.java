package visitor;

/**
 * Client
 */
public class ProjectRunner {
    public static void main(String[] args) {
        //Создаем проект и разработчиков
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        //запускаем проект с джуном и сеньером
        System.out.println("Junior is working: ");
        project.beWritten(junior);
        System.out.println("\n=====================================================\n");
        System.out.println("Senior is working: ");
        project.beWritten(senior);
    }
}
