package proxy;

//Ленивая ссылка. Теперь при создании объекта метод load() не запускается. Загружается только при вызове run().
public class ProxyProject implements Project {
    private String url;
    Project realproject;

    public ProxyProject(String url) { //такой же конструктор, принимает только ссылку
        this.url = url;
    }

    @Override
    public void run() {
        if (realproject == null) { //если объект RealProject еще не создан - создать.
            realproject = new RealProject(url);
        }
        realproject.run(); //и запустить run() у RealProject
    }
}
