package proxy;

//Класс описывает проект на гитхабе, который при создании, надо изначально скачать.
//т.е при создании  - выполнить какой-то код
public class RealProject implements Project {
    private String url;

    public void load() {
        System.out.println("Loading...");

    }

    public RealProject(String url) { //при сощдании обхекта, всешда вызывается метод load()
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running project...");
    }
}
