package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        List<Car> tests = new ArrayList();

        tests.add(factory.getCarByModel("ниссан"));
        tests.add(factory.getCarByModel("ниссан"));
        tests.add(factory.getCarByModel("ниссан"));
        tests.add(factory.getCarByModel("ниссан"));
        tests.add(factory.getCarByModel("ниссан"));
        tests.add(factory.getCarByModel("ланос"));
        tests.add(factory.getCarByModel("ланос"));
        tests.add(factory.getCarByModel("ланос"));
        tests.add(factory.getCarByModel("ланос"));
        tests.add(factory.getCarByModel("ланос"));

        for(Car car : tests) {
            car.drive();
        }
    }
}
