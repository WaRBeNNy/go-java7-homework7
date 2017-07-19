package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TaxiService implements Observed{
    List<String> orders = new ArrayList();
    List<Observer> drivers = new ArrayList<>();

    public void addOrder(String order) {
        orders.add(order);
        notifyObservers();
    }

    public void removeOrder(String order) {
        orders.remove(order);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        drivers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        drivers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : drivers) {
            o.handleEvent(orders);
        }
    }
}
