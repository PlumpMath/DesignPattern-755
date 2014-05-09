package abstractFactory;

/**
 * Similar to {@code FactoryProducer}, but provides singleton factories.
 */
public class SingletonFactoryProducer {
    private static ShapeFactory shapeFactory;
    private static ColorFactory colorFactory;

    public static AbstractFactory getFactory(String factory) {
        if (factory == null) {
            return null;
        } else if (factory.equalsIgnoreCase("color")) {
            if (colorFactory == null) {
                colorFactory = new ColorFactory();
            }
            return colorFactory;
        } else if (factory.equalsIgnoreCase("shape")) {
            if (shapeFactory == null) {
                shapeFactory = new ShapeFactory();
            }
            return shapeFactory;
        }

        return null;
    }
}
