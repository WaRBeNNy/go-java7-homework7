package structural.composite;

public class Demo {
    public static void main(String[] args) {
        Pets pets = new Pets();
        Animal cat1 = new Cat("Мурка");
        Animal dog1 = new Dog("Бобик");
        Animal dog2 = new Dog("Шарик");

        pets.add(cat1);
        pets.add(dog1);
        pets.add(dog2);

        pets.partyHard();
    }
}

