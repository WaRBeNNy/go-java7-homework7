package structural.proxy;

public class Nissan implements Car{
    private boolean belted;

    public Nissan(boolean belted) {
        this.belted = belted;
        startEngine();
    }

    public void startEngine() {
        if(belted = true)
            System.out.println("К старту готовы");
        else
            System.out.println("Пристегни ремень");
    }

    @Override
    public void drive() {
        System.out.println("Вруум-вруум!");
    }
}
