package behavioral.command;

public class Belts implements Action{
    Car car;

    public Belts(Car car) {
        this.car = car;
    }

    @Override
    public void makeAction() {
        car.closeBelts();
    }
}
