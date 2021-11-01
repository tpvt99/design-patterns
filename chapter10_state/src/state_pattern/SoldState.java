package state_pattern;

public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        int count = gumballMachine.getCount();
        count = count - 1;
        gumballMachine.setCount(count - 1);
        if (count == 0) {
            System.out.println("Ooop, out of gumballs!");
            gumballMachine.setState(GumballMachine.SOLD_OUT);
        } else {
            gumballMachine.setState(GumballMachine.NO_QUARTER);
        }
    }
}
