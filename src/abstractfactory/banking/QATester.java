package abstractfactory.banking;

import abstractfactory.Tester;

//реализуем интерфейс Tester так, чтоб он в методе testCode() тестировал банковские программы
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking program...");
    }
}
