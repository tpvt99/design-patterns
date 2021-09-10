package facade;

public class StreamingPlayer {
    String movie;

    public StreamingPlayer() {

    }

    public void on() {
        System.out.println("Streaming Player on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Streaming Player playing " + movie);
    }

    public void off() {
        System.out.println("Streaming Player off");
    }

    public void stop() {
        System.out.println("Streaming Player stopped " + this.movie);
    }
}
