package structural.facade;

public class Driving {
    SafeBelt belt = new SafeBelt();
    Car car = new Car();
    Engine engine = new Engine();

    public void letTheCarnageBegin() {
        car.drive();
        belt.lockBelt();
        engine.start(belt);
    }
}
