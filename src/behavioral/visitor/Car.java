package behavioral.visitor;

public class Car {
    CarElement[] carElements;

    public Car() {
        this.carElements = new CarElement[]{
                new SafeBelt(),
                new Mirrors(),
                new Engine()
        };
    }

    public void drive(Driver driver) {
        for(CarElement el : carElements) {
            el.use(driver);
        }
    }
}
