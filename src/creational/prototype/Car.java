package creational.prototype;

public class Car implements Copyable {
    private String name;
    private String engine;
    private int remainingFuel;

    public Car(String name, String engine, int remainingFuel) {
        this.name = name;
        this.engine = engine;
        this.remainingFuel = remainingFuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    @Override
    public Car copy() {
        return new Car(name, engine, remainingFuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", remainingFuel=" + remainingFuel +
                '}';
    }
}
