package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class HardProject implements Project{
    Developer leader;
    List<Developer> slaves = new ArrayList();

    public void setLeader(Developer leader) {
        this.leader = leader;
    }

    public void addSlaveToGroup(Developer developer) {
        slaves.add(developer);
    }

    @Override
    public void getJobDone(String projectName, Developer developer) {
        System.out.println(" делает работу");

        leader.drinkCofee();
    }
}
