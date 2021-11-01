package state_pattern;

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
        gumballMachine.setState(GumballMachine.NO_QUARTER);
    }
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(GumballMachine.SOLD);
        ///// Calling dispense at SOLD state
    }
    public void dispense() {
        System.out.println("You need to turn the crank");
    }
}
