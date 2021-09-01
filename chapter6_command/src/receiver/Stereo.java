package receiver;

public class Stereo {

    String name;
    int volume;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is On");
    }

    public void off() {
        System.out.println(name + " stereo is Off");
    }

    public void setCD() {
        System.out.println(name + " stereo set CD");
    }

    public void setDVD() {
        System.out.println(name + " stereo set DVD");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(name + " stereo set volume: " + volume);
    }

}
