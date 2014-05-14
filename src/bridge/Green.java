package bridge;

/**
 * Green color
 */
public class Green implements Color {

    @Override
    public void fillColor(Shape shape) {
        System.out.println("Fill " + shape.getShapeName() + " with green color.");
    }
}
