package proxy;

//Client
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("github.com/lucia-ya/realproject");
        project.run(); //только теперь и скачивается и запускается проект
    }
}
