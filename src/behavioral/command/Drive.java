package behavioral.command;

public class Drive implements Action{
    Car car;

    public Drive(Car car) {
        this.car = car;
    }

    @Override
    public void makeAction() {
        car.drive();
    }
}
