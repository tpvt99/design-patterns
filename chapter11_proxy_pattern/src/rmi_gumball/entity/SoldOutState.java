package rmi_gumball.entity;

public class SoldOutState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    public void refill(int n) {
        gumballMachine.setCount(n);
        gumballMachine.setState(GumballMachine.no_quarter);
    }

    @Override
    public String toString() {
        return "Sold Out State";
    }
}
