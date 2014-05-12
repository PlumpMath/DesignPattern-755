package prototype;

/**
 * {@code Rectangle} class extends {@code Shape}
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw a rectangle.");
    }
}
