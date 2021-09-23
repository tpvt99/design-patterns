public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract public void brew();

    abstract public void addCondiments();

    public void  boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
