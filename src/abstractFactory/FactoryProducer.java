package abstractFactory;

/**
 * Produces {@code ShapeFactory} and {@code ColorFactory}
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        } else if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if (factory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }

        return null;
    }
}
