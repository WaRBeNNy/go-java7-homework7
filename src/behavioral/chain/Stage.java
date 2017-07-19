package behavioral.chain;

public abstract class Stage {
    private int hoursForWork;
    private Stage nextStage;

    public Stage(int hoursForWork) {
        this.hoursForWork = hoursForWork;
    }

    public void setNextStage(Stage nextStage) {
        this.nextStage = nextStage;
    }

    public void getWorkDone(int hours) {
        if(hours >= hoursForWork) {
            work();
        }
        if(nextStage != null) {
            nextStage.getWorkDone(hours);
        }
    }

    public abstract void work();
}
