package behavioral.command;

public class Driver {
    Belts belts;
    Mirrors mirrors;
    Engine engine;
    Drive drive;

    public Driver(Belts belts, Mirrors mirrors, Engine engine, Drive drive) {
        this.belts = belts;
        this.mirrors = mirrors;
        this.engine = engine;
        this.drive = drive;
    }

    public void lockBelts() {
        belts.makeAction();
    }

    public void checkMirrors() {
        mirrors.makeAction();
    }

    public void start() {
        engine.makeAction();
    }

    public void drive() {
        drive.makeAction();
    }
}
