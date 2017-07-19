package behavioral.memento;

public class Save {
    String location;
    int health;

    public String getLocation() {
        return location;
    }

    public int getHealth() {
        return health;
    }

    public Save(String location, int health) {
        this.location = location;
        this.health = health;
    }
}
