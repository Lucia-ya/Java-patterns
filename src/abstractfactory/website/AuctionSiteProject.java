package abstractfactory.website;

import abstractfactory.Developer;
import abstractfactory.Manager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

//Пример - новая web сиситема, создаем web фабрику и смотрим что все работает
public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Creating web system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
