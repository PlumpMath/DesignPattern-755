package decorator;

/**
 * Demonstrates decorator pattern
 */
public class Demo {
    public static void main(String[] args) {
        Coffee deluxeCoffee = new BlackCoffee();
        System.out.println(deluxeCoffee.getIngredients());

        deluxeCoffee = new Milk(deluxeCoffee);
        System.out.println(deluxeCoffee.getIngredients());

        deluxeCoffee = new Sprinkles(deluxeCoffee);
        System.out.println(deluxeCoffee.getIngredients());

        deluxeCoffee = new Whip(deluxeCoffee);
        System.out.println(deluxeCoffee.getIngredients());

        System.out.println("Total cost: " + deluxeCoffee.getCost());
    }
}
