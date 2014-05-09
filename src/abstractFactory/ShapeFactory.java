package abstractFactory;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;
import factory.Square;

/**
 * {@code ShapeFactory} extends {@code AbstractFactory}.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
