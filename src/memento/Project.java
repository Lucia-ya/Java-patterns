package memento;

import java.util.Date;

/**
 * Проект с полями версии и даты, сеттер версии, в котором также сощдается дата текущего времени
 */
public class Project {
    private String version;
    private Date date;

    public void setVersionAnddate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save() { //Возвращает Save с текущей версией данного класса
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project: \n" +
                "version='" + version + "\n" +
                "date=" + date;
    }
}
