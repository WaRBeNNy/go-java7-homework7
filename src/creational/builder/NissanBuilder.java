package creational.builder;

public class NissanBuilder extends CarBuilder{
    @Override
    public void buildName() {
        car.setName("Ниссан");
    }

    @Override
    public void buildEngine() {
        car.setEngine("На бензине");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("С автоматической коробкой передач");
    }
}
