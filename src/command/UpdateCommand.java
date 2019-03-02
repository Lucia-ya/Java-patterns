package command;

/**
 * Created by Люсия on 02.03.2019.
 */
public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() { //в реализуемом методе, вызываем соответвующий реализации метод из бд
        database.update();
    }
}
