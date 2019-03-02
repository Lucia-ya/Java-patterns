package builder;

//Client
public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        //тут передаем разные реализации билдеров, и получаем разные объекты
        director.setBuilder(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebSite();

        System.out.println(webSite);
    }
}
