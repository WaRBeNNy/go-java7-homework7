package creational.abstracftfactory;

public class DieselEngine implements Engine{
    @Override
    public void useFuel() {
        System.out.println("На дизельном топливе.");
    }
}
