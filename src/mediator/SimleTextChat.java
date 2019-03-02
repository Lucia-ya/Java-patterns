package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация интерфейса Chat, поле с админом и колеекция обычных пользователей
 */
public class SimleTextChat implements Chat {
    Admin admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin) { //назначить админа в чат
        this.admin = admin;
    }

    public void addUserToChat(User user) { //добавить юзера в коллекцию
        users.add(user);
    }


    @Override
    public void sendMessage(String message, User user) { //отправляет сообщение всем пользователям, кроме отправителя
        for (User user1 : users) {
            if(user1 != user)
            user1.getMessage(message);
        }
        admin.getMessage(message); //если админ отправил сообщение, админ его тоже получает
    }
}
