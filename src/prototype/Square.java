package prototype;

/**
 * {@code Square} class extends {@code Shape}
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Draw a square.");
    }
}
