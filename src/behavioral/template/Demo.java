package behavioral.template;

public class Demo {
    public static void main(String[] args) {
        CarTemplate nissan = new Nissan();
        CarTemplate lanos = new Lanos();

        nissan.drive();

        System.out.println("===============================");

        lanos.drive();
    }
}
