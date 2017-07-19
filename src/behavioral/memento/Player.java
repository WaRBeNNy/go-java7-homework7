package behavioral.memento;

public class Player {
    private String location;
    private int health;

    public Player(String location, int health) {
        this.location = location;
        this.health = health;
    }

    public Save save() {
        return new Save(this.location, this.health);
    }

    public void load(Save save) {
        this.location = save.getLocation();
        this.health = save.getHealth();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "location='" + location + '\'' +
                ", health=" + health +
                '}';
    }
}
