public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    public double cost() {
        switch (beverage.size) {
            case TALL: return beverage.cost() + .2;
            case VENTI: return beverage.cost() + .25;
            case GRANDE: return beverage.cost() + .3;
            default: return beverage.cost();
        }
    }

}
