package chainofresponsibility;
//Реализация Notifier, которая отправляет SMS в методе WRITE
public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sendidng SMS to manager: " + message);
    }

}
