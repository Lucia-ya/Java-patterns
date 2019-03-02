package chainofresponsibility;

//абстракция одного звена цепочки.
public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier; //Следующее звено по цепи

    public Notifier(int priority) { //при создании - указываем приоритет
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) { //добавить следующее звено цепи
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) { //только если уровень уведомления >= приоритету экземпляра, выводим сообщение
            write(message);
        }
        if (nextNotifier != null) { //если есть следующее звено - передать ему аргументы
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
