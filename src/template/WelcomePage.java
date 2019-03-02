package template;

/**
 * Реализация WebsiteTemplate с преализацией метода showPageContent в зависимости от назначения класса
 */
public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome content");
    }
}
