package creational.abstracftfactory;

public interface CarFactory {
    public Transmission createTransmission();

    public Engine createEngine();
}
