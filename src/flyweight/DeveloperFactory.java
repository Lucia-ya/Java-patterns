package flyweight;

import java.util.HashMap;
import java.util.Map;

//Приспособленец
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>(); //коллекция из реализаций Developer

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality); //вытаскиваем из коллекции объект по значению

        if (developer == null) { //если в коллекции обекта с таким значением нет, то выполняется код ниже.
            //если переданная специальность соответствует "java" или "cpp"
            // создать новый объект соответствующей специальности и добавить его в коллекцию
            switch (speciality) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
