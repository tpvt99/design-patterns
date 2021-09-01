package receiver;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("GarageDoor is Open");
    }

    public void down() {
        System.out.println("GarageDoor is Closed");
    }

    public void stop() {
        System.out.println("GarageDoor is Stop");
    }

    public void lightOn() {
        System.out.println("GarageDoor is Light On");
    }

    public void lightOff() {
        System.out.println("GarageDoor is Light Off");
    }
}
