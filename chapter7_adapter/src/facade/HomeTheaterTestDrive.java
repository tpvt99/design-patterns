package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        StreamingPlayer streamingPlayer = new StreamingPlayer();
        TheaterLights theaterLights = new TheaterLights();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier,  streamingPlayer,
                 projector,
                 screen,  theaterLights,  popcornPopper);
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        System.out.println();
        homeTheaterFacade.endMovie();
    }
}
