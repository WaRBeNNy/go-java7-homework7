package behavioral.chain;

public class ThirdStage extends Stage{
    public ThirdStage(int hoursForWork) {
        super(hoursForWork);
    }

    @Override
    public void work() {
        System.out.println("Приступаем к финальному проект!");
    }
}
