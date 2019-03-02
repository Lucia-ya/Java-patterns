package abstractfactory;

//интерфейс фабрики, которая возвращает разработчика, тестировщика и менеджера
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}


