package behavioral.chain;

public class FirstStage extends Stage{
    public FirstStage(int hoursForWork) {
        super(hoursForWork);
    }

    @Override
    public void work() {
        System.out.println("Открываем ИДЕ...");
    }
}
