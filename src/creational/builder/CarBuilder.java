package creational.builder;

public abstract class CarBuilder {
    Car car;

    public Car getCar() {
        return car;
    }

    public void createCar() {
        car = new Car();
    }

    public abstract void buildName();
    public abstract void buildEngine();
    public abstract void buildTransmission();
}
