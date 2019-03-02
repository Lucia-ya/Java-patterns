package template;

/**
 * Основа для классов реализаций, чтоб не повторяться при написании header и footer
 */
public abstract class WebsiteTemplate {
    public void showPage() { //пишем код, который должен быть во всех наследниках, и вызываем метод showPageContent()
        System.out.println("Header"); //в той части, которую необходимо переопределять
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
