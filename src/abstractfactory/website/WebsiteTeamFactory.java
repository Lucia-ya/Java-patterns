package abstractfactory.website;

import abstractfactory.Developer;
import abstractfactory.Manager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

//Реализуем интерфейс фабрики, так чтобы она возвращала PhpDeveloper, ManualTester и WebsitePM
//т.е готовый набор реализаций определенных интерфейсов
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
