package bridge;
//Client
public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = { //массим с реализациями Program
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };
        for (Program program1 : programs) { //запустить метод developProgram во всех экземплярах в массиве
            program1.developProgram();
        }
    }
}
