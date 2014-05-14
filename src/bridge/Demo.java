package bridge;

/**
 * Demonstrates bridge pattern
 */
public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new Red());
        Shape greenCircle = new Circle(100, 100, 10, new Green());
        Shape redRectangle = new Rectangle(100, 100, 10, 20, new Red());
        Shape greenRectangle = new Rectangle(100, 100, 20, 30, new Green());

        redCircle.draw();
        greenCircle.draw();
        redRectangle.draw();
        greenRectangle.draw();
    }
}
