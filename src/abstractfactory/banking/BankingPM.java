package abstractfactory.banking;

import abstractfactory.Manager;

//Реализуем интерфейс Manager так, чтоб он в методе manageProject() управлял банковскими проектами
public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages banking projects...");
    }
}
