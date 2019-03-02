package prototype;

//Интервейс с методом copy, чтоб классы создающие копии точно знали какие объекты могут копироваться
//и работали с классами, которые instanceof этого интерфейса
public interface Copyable {
    Object copy();
}
