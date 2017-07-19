package behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        HardProject hard = new HardProject();
        Developer leader = new Leader(hard, "Вася");
        Developer slave1 = new Slave(hard, "Петя");
        Developer slave2 = new Slave(hard, "Миша");

        hard.setLeader(leader);
        hard.addSlaveToGroup(slave1);
        hard.addSlaveToGroup(slave2);

        slave1.work("hard");
        slave2.work("hard");
        leader.work("hard");
    }
}
