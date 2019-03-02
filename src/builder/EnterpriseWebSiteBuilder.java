package builder;

//Реализуем абстрактный билдер - делаем конструктор Enterprise Web Site
public class EnterpriseWebSiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise Web Site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);

    }
}
