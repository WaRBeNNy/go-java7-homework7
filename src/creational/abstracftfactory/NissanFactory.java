package creational.abstracftfactory;

public class NissanFactory implements CarFactory{
    @Override
    public Transmission createTransmission() {
        return new AutoTansmission();
    }

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}
