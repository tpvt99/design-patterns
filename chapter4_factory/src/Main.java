import pizza.chicago.ChicagoPizzaStore;
import pizza.newyork.NYPizzaStore;
import pizza.Pizza;
import pizza.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        PizzaStore cgPizzaStore = new ChicagoPizzaStore();
        pizza = cgPizzaStore.orderPizza("cheese");
        System.out.println("Luke ordered a " + pizza.getName());
    }
}
