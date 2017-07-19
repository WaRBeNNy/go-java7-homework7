package structural.bridge;

public abstract class Vehicle {
    Car car;

    protected Vehicle(Car car) {
        this.car = car;
    }

    public void drive() {
        car.drive();
    }
}
