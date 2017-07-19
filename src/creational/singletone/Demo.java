package creational.singletone;

public class Demo {
    public static void main(String[] args) {
        Garage.getGarage().addCar("Ниссан");
        Garage.getGarage().addCar("Ланос");

        Garage.getGarage().showGarage();
    }
}
