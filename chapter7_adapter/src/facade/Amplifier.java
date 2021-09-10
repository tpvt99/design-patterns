package facade;

public class Amplifier {
    int volume;
    StreamingPlayer player;

    public Amplifier() {

    }

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier setting volume to " + volume);
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
        System.out.println("Amplifier  setting Streaming player to " + player);
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }
}
