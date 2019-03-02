package mediator;

/**
 * Интерфейс пользователя, который умеет отправлять и получать сообщения
 */
public interface User {
    public void sendMessage(String message); //отправить сообщение

    public void getMessage(String message);

}
