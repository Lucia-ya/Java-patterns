package abstractfactory.website;

import abstractfactory.Manager;

//Реализуем интерфейс Manager так, чтоб он в методе manageProject() управлял web проектами
public class WebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manage wibsite projects...");
    }
}
