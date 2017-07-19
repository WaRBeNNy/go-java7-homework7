package behavioral.state;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        State state = new Life();

        player.setState(state);

        player.getState();

        player.getDamage(50);

        player.getDamage(100);
    }
}
