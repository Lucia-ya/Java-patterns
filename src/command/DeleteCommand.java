package command;

public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() { //в реализуемом методе, вызываем соответвующий реализации метод из бд
        database.delete();
    }
}
