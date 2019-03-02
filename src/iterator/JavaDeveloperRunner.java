package iterator;

/**
 * Client
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"}; //Создание массива со скиллами

        JavaDeveloper javaDeveloper = new JavaDeveloper("Lucia Yarushkina", skills); //Разработчик - имя, навыки

        Iterator iterator = javaDeveloper.getIterator(); //Создать итератор разработчика.

        System.out.println("Java Developer: " + javaDeveloper.getName());
        System.out.println("Skills: " );
        while (iterator.hasNext()) { //вывести на эеран все скилы с помощью итератора
            System.out.println(iterator.next().toString());
        }
    }

}
