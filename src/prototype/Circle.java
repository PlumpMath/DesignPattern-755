package prototype;

/**
 * {@code Circle} class extends {@code Shape} class.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Draw a circle.");
    }
}
