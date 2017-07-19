package structural.facade;

public class Engine {
    SafeBelt belt;

    public void start(SafeBelt belt) {
        if(belt.isLocked()) {
            System.out.println("Врууум-вруууммм, поехали!");
        } else {
            System.out.println("Ремень-то пристегни!");
        }
    }
}
