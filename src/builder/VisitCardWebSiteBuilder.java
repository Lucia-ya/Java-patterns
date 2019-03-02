package builder;

//реализуем абстрактный билдер - делаем конструктор Visit Card
public class VisitCardWebSiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit Card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
