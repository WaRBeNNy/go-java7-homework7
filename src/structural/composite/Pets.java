package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    List<Animal> animals = new ArrayList<Animal>();

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void partyHard() {
        for(Animal animal : animals) {
            animal.entertain();
        }
    }
}
