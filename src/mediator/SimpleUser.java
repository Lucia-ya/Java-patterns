package mediator;

/**
 * Обычный юзер - Поля имя и чат, конструктор с ними, геттеры и сеттеры для имени, реализация методов интерфейса
 */
public class SimpleUser implements User {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this); //вызвать у чата метод sendMessage, передать ему сообщение и данного юзера
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " receiving message: " + message);

    }
}
