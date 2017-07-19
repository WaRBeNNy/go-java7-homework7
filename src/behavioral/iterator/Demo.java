package behavioral.iterator;

public class Demo {
    public static void main(String[] args) {
        String[] cars = {"Ниссан", "Ланос", "Тойота", "Митсубиси"};
        Garage garage = new Garage("Мой", cars);

        System.out.println(garage.getName());

        Iterator iterator = garage.getIteratir();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
}
