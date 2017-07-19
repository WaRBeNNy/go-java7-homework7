package behavioral.command;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver(
                new Belts(car),
                new Mirrors(car),
                new Engine(car),
                new Drive(car)
        );

        driver.lockBelts();
        driver.checkMirrors();
        driver.start();
        driver.drive();
    }
}
