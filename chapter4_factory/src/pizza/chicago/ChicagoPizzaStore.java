package pizza.chicago;

import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PizzaStore;
import pizza.Pizza;
import pizza.ingredients.ChicagoPizzaIngredientFactory;
import pizza.ingredients.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam PIzza");
        } else
            return null;
        return pizza;

    }
}
