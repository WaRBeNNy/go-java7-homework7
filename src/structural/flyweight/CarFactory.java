package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> cars = new HashMap<>();

    public Car getCarByModel(String model) {
        Car car = cars.get(model);

        if(car == null) {
            switch(model) {
                case "ниссан":
                    System.out.println("Покупаем ниссан");
                    car = new Nissan();
                    break;
                case "ланос":
                    System.out.println("Покупаем ланос");
                    car = new Lanos();
            }
            cars.put(model, car);
        }
        return car;
    }
}
