package creational.abstracftfactory;

public class AutoTansmission implements Transmission{
    @Override
    public void setTransmission() {
        System.out.println("Коробка передач - автоматическая.");
    }
}
