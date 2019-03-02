package prototype;

//Client
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super project", "SourceCode sourceCode = new SourceCode()");
        System.out.println(master);
        ProjectFactory projectFactory = new ProjectFactory(master); //создаем projectFactory, который копирует Project
        Project copy = projectFactory.cloneProject(); //передаем в projectFactory master и получаем копию
        System.out.println(copy);

    }

}
