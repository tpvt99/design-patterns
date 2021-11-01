package state_pattern;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String toString() {
        return "Mighty Gumball, Inc." + "\n" + "Java-enabled Standing Gumball Model #2004" + "\n" +
                "Inventory: " + count + " gumballs" + "\n";
    }
}
