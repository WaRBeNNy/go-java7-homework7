package creational.abstracftfactory;

public class ManualTransmission implements Transmission{
    @Override
    public void setTransmission() {
        System.out.println("Коробка передач - ручная.");
    }
}
