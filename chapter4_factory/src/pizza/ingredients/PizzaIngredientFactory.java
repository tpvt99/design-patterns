package pizza.ingredients;

import pizza.ingredients.cheese.Cheese;
import pizza.ingredients.clam.Clams;
import pizza.ingredients.dough.Dough;
import pizza.ingredients.pepperoni.Pepperoni;
import pizza.ingredients.sauce.Sauce;
import pizza.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
