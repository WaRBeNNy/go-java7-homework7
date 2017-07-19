package behavioral.chain;

public class SecondStage extends Stage{
    public SecondStage(int hoursForWork) {
        super(hoursForWork);
    }

    @Override
    public void work() {
        System.out.println("Читаем документацию...");
    }
}
