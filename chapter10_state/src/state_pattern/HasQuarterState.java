package state_pattern;
import java.util.Random;

public class HasQuarterState implements  State{
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("You can't inserted another quarter");
    }
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(GumballMachine.no_quarter);

    }
    public void turnCrank() {
        System.out.println("You turned...");
        Random rand = new Random();
        if (rand.nextFloat() < 0.9) {
            gumballMachine.setState(GumballMachine.winner);
        } else {
            gumballMachine.setState(GumballMachine.sold);
        }
    }
    public void dispense() {
        System.out.println("You need to turn the crank");
    }

    public void refill(int n) {
        System.out.println("No need to refill");
    }
}
