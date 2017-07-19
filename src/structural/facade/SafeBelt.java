package structural.facade;

public class SafeBelt {
    private boolean isLocked;

    public boolean isLocked() {
        return isLocked;
    }

    public void lockBelt() {
        this.isLocked = true;
    }

    public void openBelt() {
        this.isLocked = false;
    }
}

