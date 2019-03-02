package builder;

//абстрактный класс builder-ов для класса WebSite
public abstract class WebsiteBuilder {
    WebSite webSite;

    void createWebsite() { //присваивает переменной новый объект WebSite
        webSite = new WebSite();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    WebSite getWebsite() { //возвращает готовый объект
        return webSite;
    }
}
