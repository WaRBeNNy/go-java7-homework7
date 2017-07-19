package creational.factory;

public class CarFactory {
    Car car;

    public Car getCar(Double salary) {
        if(salary < 5000.00) {
            car = new Lanos();
        } else {
            car = new Nissan();
        }
        return car;
    }
}
