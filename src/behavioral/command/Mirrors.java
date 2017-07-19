package behavioral.command;

public class Mirrors implements Action{
    Car car;

    public Mirrors(Car car) {
        this.car = car;
    }

    @Override
    public void makeAction() {
        car.checkMirrors();
    }
}
