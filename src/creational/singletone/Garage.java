package creational.singletone;

public class Garage {
    private static Garage garage;
    private static String cars = "В общем гараже есть: \n";

    public static synchronized Garage getGarage() {
        if( garage == null) {
            garage = new Garage();
        }

        return garage;
    }

    private Garage() {
    }

    public void addCar(String car) {
        cars += car + "\n";
    }

    public void showGarage() {
        System.out.println(cars);
    }
}
