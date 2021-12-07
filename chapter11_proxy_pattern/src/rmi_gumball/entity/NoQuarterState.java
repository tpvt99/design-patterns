package rmi_gumball.entity;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public String toString() {
        return "No Quarter State";
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(GumballMachine.has_quarter);
    }
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }
    public void dispense() {
        System.out.println("You need to pay first");
    }
    public void refill(int n) {
        System.out.println("No need to refill");
    }
}
