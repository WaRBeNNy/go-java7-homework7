package creational.abstracftfactory;

public class PetrolEngine implements Engine{
    @Override
    public void useFuel() {
        System.out.println("На бензине.");
    }
}
