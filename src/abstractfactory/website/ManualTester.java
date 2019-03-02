package abstractfactory.website;

import abstractfactory.Tester;

//реализуем интерфейс Tester так, чтоб он в методе testCode() тестировал web программы
public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual tester tests websit...");
    }
}
