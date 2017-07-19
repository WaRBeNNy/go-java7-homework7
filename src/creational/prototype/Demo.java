package creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Ниссан", "Дизельный", 50);

        System.out.println(car);

        Car car2 = car.copy();

        car2.setRemainingFuel(45);

        System.out.println(car2);
    }
}
