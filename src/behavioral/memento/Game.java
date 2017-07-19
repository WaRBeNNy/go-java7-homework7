package behavioral.memento;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Start", 100);
        Menu menu = new Menu();

        System.out.println(player.toString());
        System.out.println("Передвигаемся в локацию болот");
        player.setLocation("Болото");
        System.out.println("Встречаем ящерицу и теряем 20 здоровья");
        player.setHealth(80);
        System.out.println(player.toString());
        System.out.println("Сохраняемся...");
        menu.save(player.save());
        System.out.println("Переходим в локацию пещер");
        player.setLocation("Пещера");
        System.out.println("Спотыкаемся о камень и почти умираем");
        player.setHealth(1);
        System.out.println(player.toString());
        System.out.println("Загружаемся");
        player.load(menu.load());
        System.out.println(player.toString());
    }
}
