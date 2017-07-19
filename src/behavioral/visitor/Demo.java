package behavioral.visitor;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        Driver man = new Man();
        Driver woman = new Woman();

        car.drive(man);

        System.out.println("===============================");

        car.drive(woman);
    }
}
