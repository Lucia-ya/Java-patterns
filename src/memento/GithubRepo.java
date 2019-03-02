package memento;

/**
 * Репозиторий на гитхабе только с полем Save и геттером и сетттером для него;
 */
public class GithubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

}
