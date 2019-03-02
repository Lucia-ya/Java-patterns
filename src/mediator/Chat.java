package mediator;

/**
 * Интерфейс чата, который в методе sendMessage принимает сообщение, и юзера который отправил это сообщение
 */
public interface Chat {
    public void sendMessage(String message, User user);
}
