package behavioral.visitor;

public interface Driver {
    public void use(SafeBelt belt);

    public void use(Mirrors mirrors);

    public void use(Engine engine);
}
