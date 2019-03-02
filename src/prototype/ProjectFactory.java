package prototype;

//класс, с помощью которого будут делаться копии. Т.к напрямую обращаться к объекту и его методу copy - не правильно
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
