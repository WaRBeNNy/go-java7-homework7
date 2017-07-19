package behavioral.state;

public class Player {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void getDamage(int damage) {
        if(damage > 99) {
            setState(new Death());
            getState();
        } else if( damage > 0) {
            setState(new Wounded());
            getState();
        }
    }

    public void getState() {
        state.getState();
    }
}
