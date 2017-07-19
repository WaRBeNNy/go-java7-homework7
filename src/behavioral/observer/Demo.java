package behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        TaxiService service = new TaxiService();
        Observer driver1 = new Driver("Вася");
        Observer driver2 = new Driver("Петя");

        service.addOrder("Туда");
        service.addOrder("Сюда");

        service.addObserver(driver1);
        service.addObserver(driver2);

        service.addOrder("Туда-сюда");

        service.removeOrder("Сюда");


    }
}
