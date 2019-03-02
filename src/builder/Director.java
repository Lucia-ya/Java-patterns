package builder;

//В этом классе определяется кокой именно WebSite будет конструироваться.
//Т.е выбираем конструктор для объекта.
public class Director {
    WebsiteBuilder builder;

    //принимает реализацию WebsiteBuilder, что и определяет конструктор будет использоваться
    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite() { //упрощение кода на стороне клиента, вместо 5 строк - вызов одного метода.
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        return builder.getWebsite();
    }
}
