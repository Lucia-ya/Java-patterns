package bridge;

//реализация Program - добавлен в метод developProgram() новый код для банковских систем
public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in process...");
        developer.writeCode();
    }
}
