package memento;

/**
 * Created by Люсия on 02.03.2019.
 */
public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        project.setVersionAnddate("1.0");
        System.out.println(project);
        System.out.println("Saving to github...");
        githubRepo.setSave(project.save());
        Thread.sleep(5000);
        System.out.println("Updating...");
        project.setVersionAnddate("1.1");
        System.out.println("Project: " + project);
        System.out.println("Откатываемся до старой версии...");
        project.load(githubRepo.getSave());
        System.out.println("Project: " + project);
    }
}
