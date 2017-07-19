package behavioral.command;

public class Engine implements Action{
    Car car;

    public Engine(Car car) {
        this.car = car;
    }


    @Override
    public void makeAction() {
        car.startEngine();
    }
}
