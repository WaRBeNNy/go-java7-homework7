package behavioral.template;

public abstract class CarTemplate {
    public void drive() {
        System.out.println("Пристегнули ремни");
        System.out.println("Проверили зеркала");
        System.out.println("Завели двигатель");
        move();
    }

    protected abstract void move();
}
