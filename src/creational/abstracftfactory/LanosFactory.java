package creational.abstracftfactory;

public class LanosFactory implements CarFactory{
    @Override
    public Transmission createTransmission() {
        return new ManualTransmission();
    }

    @Override
    public Engine createEngine() {
        return new DieselEngine();
    }
}
