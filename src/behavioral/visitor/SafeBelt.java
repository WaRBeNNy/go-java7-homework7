package behavioral.visitor;

public class SafeBelt implements CarElement{
    @Override
    public void use(Driver driver) {
        driver.use(this);
    }
}
