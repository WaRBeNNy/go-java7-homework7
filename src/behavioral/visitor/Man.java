package behavioral.visitor;

public class Man implements Driver{
    @Override
    public void use(SafeBelt belt) {
        System.out.println("Ремень пристегнут");
    }

    @Override
    public void use(Mirrors mirrors) {
        System.out.println("Зеркала отрегулированы");
    }

    @Override
    public void use(Engine engine) {
        System.out.println("Двигатель запушен. Вруум-вруум");
    }
}
