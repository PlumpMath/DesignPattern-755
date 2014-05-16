package decorator;

import java.util.List;

/**
 * Sprinkles decorator
 */
public class Sprinkles extends CoffeeDecorator{
    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 20;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredientList = super.getIngredients();
        ingredientList.add("Sprinkles");
        return ingredientList;
    }

}
