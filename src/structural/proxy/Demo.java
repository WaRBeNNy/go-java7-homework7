package structural.proxy;

public class Demo {
    public static void main(String[] args) {
        Car car = new CarProxy(true);

        car.drive();
    }
}
