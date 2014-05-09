package factory;

/**
 * Demonstrates factory pattern.
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape rectangle = factory.getShape("rectangle");
        Shape circle = factory.getShape("circle");
        Shape square = factory.getShape("square");

        rectangle.draw();
        circle.draw();
        square.draw();
    }
}
