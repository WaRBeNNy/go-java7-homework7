package creational.builder;

public class LanosBuilder extends CarBuilder{
    @Override
    public void buildName() {
        car.setName("Ланос");
    }

    @Override
    public void buildEngine() {
        car.setEngine("На дизельном топливе");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("С ручной коробкой передач");
    }
}
