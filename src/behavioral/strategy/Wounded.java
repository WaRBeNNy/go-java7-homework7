package behavioral.strategy;

public class Wounded implements State {
    @Override
    public void getState() {
        System.out.println("Бывало и лучше");
    }
}
