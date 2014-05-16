package decorator;

import java.util.List;

/**
 * Milk decorator
 */
public class Milk extends CoffeeDecorator {
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 50;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredientList = super.getIngredients();
        ingredientList.add("Milk");
        return ingredientList;
    }

}
