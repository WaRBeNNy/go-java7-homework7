package behavioral.command;

public class Car {
    public void closeBelts() {
        System.out.println("Ремни пристегнуты");
    }

    public void checkMirrors() {
        System.out.println("Зеркала отрегулированы");
    }

    public void startEngine() {
        System.out.println("Двигатель завелся");
    }

    public void drive() {
        System.out.println("Машина делает вруум-врууум");
    }
}
