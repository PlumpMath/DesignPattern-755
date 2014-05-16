package decorator;

import java.util.List;

/**
 * Whip decorator
 */
public class Whip extends CoffeeDecorator {
    public Whip(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 70;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredientList = super.getIngredients();
        ingredientList.add("Whip");
        return ingredientList;
    }
}
