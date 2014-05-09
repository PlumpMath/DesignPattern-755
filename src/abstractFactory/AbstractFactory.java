package abstractFactory;

import factory.Shape;

/**
 * {@code AbstractFactory} is responsible for creating {@code ShapeFactory} and {@code ColorFactory}.
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shape);

    abstract Color getColor(String color);
}
