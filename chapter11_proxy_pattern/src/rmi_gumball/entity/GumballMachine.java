package rmi_gumball.entity;

import rmi_gumball.entity.*;
import rmi_gumball.server.GumballMachineRemote;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine  extends UnicastRemoteObject implements GumballMachineRemote {
    final State SOLD_OUT = new SoldOutState(this);
    final State NO_QUARTER = new NoQuarterState(this);
    final State HAS_QUARTER = new HasQuarterState(this);
    final State SOLD = new SoldState(this);
    final State WINNER = new WinnerState(this);

    final static int sold_out = 0;
    final static int no_quarter = 1;
    final static int has_quarter = 2;
    final static int sold = 3;
    final static int winner = 4;

    private State state;
    private int count = 0;
    private String location;

    private static final long sericalVersionUID = 1L;

    public GumballMachine(String location, int count) throws RemoteException {
        this.count = count;
        this.location = location;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(int state) {
        if (state == sold_out)
            this.state = SOLD_OUT;
        else if (state == no_quarter)
            this.state = NO_QUARTER;
        else if (state == has_quarter)
            this.state = HAS_QUARTER;
        else if (state == sold)
            this.state = SOLD;
        else if (state == winner)
            this.state = WINNER;
    }


    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();

    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void refill(int n) {
        state.refill(n);
    }

    public String toString() {
        return "Mighty Gumball, Inc." + "\n" + "Java-enabled Standing Gumball Model #2004" + "\n" +
                "Inventory: " + count + " gumballs" + "\n";
    }
}
