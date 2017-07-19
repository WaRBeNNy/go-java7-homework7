package behavioral.strategy;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        State state = new Life();

        player.setState(state);

        player.getState();

        System.out.println("Получен небольшой урон");
        player.setState(new Wounded());
        player.getState();

        System.out.println("Получен летальный урон!");
        player.setState(new Death());
        player.getState();
    }
}
