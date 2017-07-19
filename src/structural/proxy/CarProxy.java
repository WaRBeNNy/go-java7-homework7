package structural.proxy;

public class CarProxy implements Car{
    private boolean belted;
    Car car;

    public CarProxy(boolean belted) {
        this.belted = belted;
    }

    @Override
    public void drive() {
        car = new Nissan(belted);
        car.drive();
    }
}
