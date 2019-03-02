package chainofresponsibility;

//Client
public class BugTracker {
    public static void main(String[] args) {
        //Создаем все три типа уведомлений
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotofoer = new SMSNotifier(Priority.ASAP);

        //устанавливаем следующие объекты в цепи каждлому объекту кроме конечного в цепи
        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotofoer);

        //отправляем уведомления разного приоритета
        reportNotifier.notifyManager("EveryThingIs OKAY", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong OKAY", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houstan, we`ve have a problem!", Priority.ASAP);
    }
}
