package command;

/**
 * Client
 * Создаем бд, создаем разработчика, и в конструкторе разработчика создаем все типы команд, которые
 * в свою очерель в конструкторе принимают созданную бд
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database));

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
