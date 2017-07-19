package behavioral.chain;

public class Demo {
    public static void main(String[] args) {
        Stage first = new FirstStage(1);
        Stage second = new SecondStage(2);
        Stage third = new ThirdStage(3);

        first.setNextStage(second);
        second.setNextStage(third);

        first.getWorkDone(3);
    }
}
