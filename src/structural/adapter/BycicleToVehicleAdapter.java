package structural.adapter;

public class BycicleToVehicleAdapter extends Bycicle implements Vehicle{
    @Override
    public void fixWheels() {
        pumpWheels();
    }

    @Override
    public void refuel() {
        grease();
    }

    @Override
    public void checkParametres() {
        calibrateBrakes();
    }
}
