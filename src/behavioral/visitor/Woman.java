package behavioral.visitor;

public class Woman implements Driver{
    @Override
    public void use(SafeBelt belt) {
        System.out.println("Ремень привязан");
    }

    @Override
    public void use(Mirrors mirrors) {
        System.out.println("Губы накрашены");
    }

    @Override
    public void use(Engine engine) {
        System.out.println("Двигатель запущен. Пух-пух.");
    }
}
