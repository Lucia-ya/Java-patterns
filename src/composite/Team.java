package composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    //добавляет объект в коллекцию
    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    //удаляет объект из коллекции
    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    //вызывает у каждого объекта в коллекции метод writeCode()
    public void createProject() {
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
