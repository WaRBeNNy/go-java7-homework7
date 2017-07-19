package structural.bridge;

public class Demo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new VehicleImpl(new Nissan()),
            new VehicleImpl(new Lanos())
        };

        for(Vehicle vehicle: vehicles) {
            vehicle.drive();
        }
    }
}
