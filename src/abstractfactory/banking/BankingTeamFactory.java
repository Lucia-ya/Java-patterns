package abstractfactory.banking;

import abstractfactory.Developer;
import abstractfactory.Manager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

//Реализуем интерфейс фабрики, так чтобы она возвращала JavaDeveloper, QATester и BankingPM
//т.е готовый набор реализаций определенных интерфейсов
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
