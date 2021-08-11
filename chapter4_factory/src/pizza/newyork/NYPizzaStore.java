package pizza.newyork;

import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.ingredients.NYPizzaIngredientFactory;
import pizza.ingredients.PizzaIngredientFactory;
import pizza.Pizza;
import pizza.PizzaStore;

public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else
            return null;
        return pizza;
    }
}
