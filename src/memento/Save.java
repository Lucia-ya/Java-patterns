package memento;

import java.util.Date;

/**
 * Класс для хранения значений полей Project, который в конструкторе принимает версию.
 */
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date =  new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
