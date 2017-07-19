package structural.composite;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void entertain() {
        System.out.println("Собака " + name + " грызет мебель.");
    }
}
