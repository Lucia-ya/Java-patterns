package command;

public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() { //в реализуемом методе, вызываем соответвующий реализации метод из бд
        database.select();
    }
}
