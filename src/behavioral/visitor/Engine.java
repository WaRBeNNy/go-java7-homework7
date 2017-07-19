package behavioral.visitor;

public class Engine implements CarElement{
    @Override
    public void use(Driver driver) {
        driver.use(this);
    }
}
