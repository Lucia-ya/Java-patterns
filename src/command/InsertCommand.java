package command;

public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() { //в реализуемом методе, вызываем соответвующий реализации метод из бд
        database.insert();

    }
}
