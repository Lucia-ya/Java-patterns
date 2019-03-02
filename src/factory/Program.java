package factory;

//Класс клиента

public class Program {
    public static void main(String[] args) {
        //создаем фабрику исходя из передаваемой в агргумете специальности
        DeveloperFactory developerFactory = createDeveloperBySpaciality("a");
        Developer developer = developerFactory.createDeveloper(); //создаем разработчика
        developer.writeCode(); //разработчик выводит в консоль строку в зависимости от реализации
    }

    //возвращает фабрику в зависимости от специальности, которая нам необходима.
    static DeveloperFactory createDeveloperBySpaciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFcatory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            //если специальности передаваемой в аргументе нет, выкинуть RuntimeException
            throw new RuntimeException(speciality + " is unknown speciality");
        }

    }
}
