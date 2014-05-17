package decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Black coffee only has one ingredient -- coffee
 */
public class BlackCoffee extends Coffee {

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<String>();
        ingredients.add("Coffee");
        return ingredients;
    }

}
