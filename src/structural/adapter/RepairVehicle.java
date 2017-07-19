package structural.adapter;

public class RepairVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new BycicleToVehicleAdapter();

        vehicle.fixWheels();
        vehicle.checkParametres();
        vehicle.refuel();
    }
}
