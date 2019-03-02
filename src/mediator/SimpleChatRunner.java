package mediator;

/**
 * Client
 */
public class SimpleChatRunner {
    public static void main(String[] args) {
        //создаем чат, админа и юзеров
        SimleTextChat chat = new SimleTextChat();
        Admin admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        //добавляем админа и юзеров в чат
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        //Проверяем что сообщения отправляются - у отправителя юзера не показываются, а у отправителя админа есть
        user1.sendMessage("Приветики");
        user2.sendMessage("Приветики");
        admin.sendMessage("I am root");

    }
}
