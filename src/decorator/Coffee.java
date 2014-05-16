package decorator;

import java.util.List;

/**
 * Coffee interface
 */
public abstract class Coffee {

    protected abstract int getCost();

    protected abstract List<String> getIngredients();

}
