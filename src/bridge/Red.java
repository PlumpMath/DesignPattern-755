package bridge;

/**
 * Read circle
 */
public class Red implements Color {

    @Override
    public void fillColor(Shape shape) {
        System.out.println("Fill " + shape.getShapeName() + " with red color.");
    }
}
