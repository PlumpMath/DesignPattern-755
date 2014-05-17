package facade;

import decorator.BlackCoffee;
import decorator.Coffee;
import decorator.Milk;
import decorator.Whip;

/**
 * Provides facades to make various coffee
 */
public class CoffeeFacade {

    public Coffee makeBlackCoffee() {
        return new BlackCoffee();
    }

    public Coffee makeLatte() {
        return new Milk(makeBlackCoffee());
    }

    public Coffee makeLatteWithWhip() {
        return new Whip(makeLatte());
    }
}
