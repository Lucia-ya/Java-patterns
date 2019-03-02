package singleton;

//Пример singleton - класс, описывающий логфайл. Создать можно только один экземпляр.

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file\n\n"; //сам лог

    //метод, возвращающий экземпляр. Если еще не создан - создает. synchronized - для многопоточности
    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() { //приватный конструктор

    }

    public void addLogInfo(String logInfo) { //добавить в лог нформацию
        logFile += logInfo + "\n";
    }

    public void showLogFile() { //вывести лог в консоль
        System.out.println(logFile);
    }
}
