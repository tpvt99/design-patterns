package pizza.ingredients;

import pizza.ingredients.cheese.Cheese;
import pizza.ingredients.cheese.ReggianoCheese;
import pizza.ingredients.clam.Clams;
import pizza.ingredients.clam.FreshClams;
import pizza.ingredients.dough.Dough;
import pizza.ingredients.dough.ThinCrustDough;
import pizza.ingredients.pepperoni.Pepperoni;
import pizza.ingredients.pepperoni.SlicePepperoni;
import pizza.ingredients.sauce.MarinaraSauce;
import pizza.ingredients.sauce.Sauce;
import pizza.ingredients.veggies.*;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }

}
