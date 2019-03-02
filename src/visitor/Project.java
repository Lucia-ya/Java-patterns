package visitor;

/**
 * Реализация ProjectElement - с массивом ProjectElement, конструктор, который создает по одному типу элементав массив
 */
public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[]{new Database(), new ProjectClass(), new Test()};
    }

    @Override
    public void beWritten(Developer developer) { //запускает метод beWritten у каждого элемента с разработчиком.
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }

    }
}
