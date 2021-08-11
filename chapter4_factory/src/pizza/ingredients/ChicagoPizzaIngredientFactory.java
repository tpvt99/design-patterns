package pizza.ingredients;

import pizza.ingredients.cheese.Cheese;
import pizza.ingredients.cheese.MozzarellaCheese;
import pizza.ingredients.cheese.ReggianoCheese;
import pizza.ingredients.clam.Clams;
import pizza.ingredients.clam.FreshClams;
import pizza.ingredients.clam.FrozenClams;
import pizza.ingredients.dough.Dough;
import pizza.ingredients.dough.ThickCrustDough;
import pizza.ingredients.dough.ThinCrustDough;
import pizza.ingredients.pepperoni.Pepperoni;
import pizza.ingredients.pepperoni.SlicePepperoni;
import pizza.ingredients.sauce.MarinaraSauce;
import pizza.ingredients.sauce.PlumTomatoSauce;
import pizza.ingredients.sauce.Sauce;
import pizza.ingredients.veggies.*;

public class ChicagoPizzaIngredientFactory implements  PizzaIngredientFactory{
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Spinach(), new EggPlant(), new Mushroom(), new BlackOlives()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
