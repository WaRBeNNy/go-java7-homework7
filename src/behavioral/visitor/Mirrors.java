package behavioral.visitor;

public class Mirrors implements CarElement{
    @Override
    public void use(Driver driver) {
        driver.use(this);
    }
}
