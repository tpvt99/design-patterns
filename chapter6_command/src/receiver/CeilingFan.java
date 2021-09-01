package receiver;

public class CeilingFan {
    String name;
    int speed;
    public static final int LOW = 20;
    public static final int MEDIUM = 50;
    public static final int HIGH = 80;
    public static final int OFF = 0;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void speedLow() {
        speed = LOW;
        System.out.println(name + "Ceiling fan has speed : " + speed);
    }

    public void speedMedium() {
        speed = MEDIUM;
        System.out.println(name + "Ceiling fan has speed : " + speed);
    }

    public void speedHigh() {
        speed = HIGH;
        System.out.println(name + "Ceiling fan has speed : " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void off() {
        System.out.println(name + "ceiling fan is Off");
        speed = OFF;
    }


}
