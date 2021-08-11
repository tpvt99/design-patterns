public  abstract class CondimentDecorator extends Beverage{ // extend Beverage to assign Beverage b1 = new Mocha(b1); Beverage b1 = new Whip(b1)
    Beverage beverage; // have beverage to get the cost and description
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription();
    }
}
