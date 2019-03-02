package command;

/**
 *  Класс разработчик, который содержит в себе поля всех комманд и конструктор к ним.
 *  И методы для каждой из команд.
 */
public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord() {
        insert.execute();
    }
    public void updateRecord() {
        update.execute();
    }
    public void selectRecord() {
        select.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }


}
