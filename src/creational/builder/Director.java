package creational.builder;

public class Director {
    private CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car getCar() {
        return builder.getCar();
    }

    public void constructCar() {
        builder.createCar();
        builder.buildEngine();
        builder.buildName();
        builder.buildTransmission();
    }
}
