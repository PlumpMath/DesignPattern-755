package decorator;

import java.util.List;

/**
 * Coffee decorator
 */
public abstract class CoffeeDecorator extends Coffee {

    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    protected int getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    protected List<String> getIngredients() {
        return decoratedCoffee.getIngredients();
    }

}
