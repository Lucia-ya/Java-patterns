package composite;

//Группировка мелких объектов в более крупные объекты
//Client
public class Project {
    public static void main(String[] args) {
        Team team = new Team(); //Создаем коммпоновщик

        //создаем и добавляем в компоновщик более мелкие объекты
        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        //вызывает у всех объектов в коллекции Team метод writeCode()
        team.createProject();
    }
}
