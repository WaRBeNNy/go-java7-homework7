package behavioral.memento;

public class Menu {
    Save save;

    public void save(Save save) {
        this.save = save;
    }

    public Save load() {
        return save;
    }


}
