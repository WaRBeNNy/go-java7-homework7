package structural.composite;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void entertain() {
        System.out.println("Кошка " + name + " лезет на штору!");
    }
}
