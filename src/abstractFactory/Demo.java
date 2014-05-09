package abstractFactory;

import factory.Shape;

/**
 * Demonstrates abstract factory pattern.
 */
public class Demo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Shape circle = shapeFactory.getShape("circle");
        Color red = colorFactory.getColor("red");

        circle.draw();
        red.fill();
    }
}
