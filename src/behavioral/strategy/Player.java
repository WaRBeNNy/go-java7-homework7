package behavioral.strategy;

public class Player {
    State state;

    public void setState(State state) {
        this.state = state;
    }

      public void getState() {
        state.getState();
    }
}
