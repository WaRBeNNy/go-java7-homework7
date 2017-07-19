package behavioral.observer;

import java.util.List;

public class Driver implements Observer{
    String name;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> orders) {
        System.out.println("Дорогой " + name + " в настоящее время доступны следующие заказы:\n" + orders);
    }
}
