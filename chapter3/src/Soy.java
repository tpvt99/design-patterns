public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    public double cost() {
        switch (beverage.size) {
            case TALL: return beverage.cost() + .15;
            case VENTI: return beverage.cost() + .2;
            case GRANDE: return beverage.cost() + .25;
            default: return beverage.cost();
        }
    }

}
