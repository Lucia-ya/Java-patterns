package decorator;

//Наследуемся от декоратора, и в метод makeJob() добавляем новый код, исходя из специализации + super.makeJob()
public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
