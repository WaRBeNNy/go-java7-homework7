package creational.abstracftfactory;

public class Car {
    private Transmission transmission;
    private Engine engine;

    public Car(CarFactory factory) {
        this.transmission = factory.createTransmission();
        this.engine = factory.createEngine();
    }

    public void demo() {
        transmission.setTransmission();
        engine.useFuel();
    }
}
