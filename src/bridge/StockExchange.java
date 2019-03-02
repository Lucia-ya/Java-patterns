package bridge;

//Реализация Program - добавлен в метод developProgram() код для Stock Exchange
public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress:");
        developer.writeCode();
    }
}
