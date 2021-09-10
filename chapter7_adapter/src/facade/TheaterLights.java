package facade;

public class TheaterLights {
    int n;

    public TheaterLights() {

    }

    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }

    public void dim(int n) {
        this.n = n;
        System.out.println("Theater Ceiling Lights dimming to " + n + "%");
    }
}
