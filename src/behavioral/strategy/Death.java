package behavioral.strategy;

public class Death implements State {
    @Override
    public void getState() {
        System.out.println("Плохо все");
    }
}
