package abstractfactory.website;

import abstractfactory.Developer;
import abstractfactory.Manager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;
import abstractfactory.banking.BankingTeamFactory;

//Пример - новая банковская сиситема, создаем банковскую фабрику и смотрим что все работает
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }

}
