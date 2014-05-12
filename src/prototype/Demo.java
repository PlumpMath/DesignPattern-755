package prototype;

/**
 * Demonstrates prototype pattern
 */
public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape(Shapes.CIRCLE);
        Shape clonedRectangle = ShapeCache.getShape(Shapes.RECTANGLE);
        Shape clonedSquare = ShapeCache.getShape(Shapes.SQUARE);

        System.out.println("Shape: " + clonedCircle.getType());
        clonedCircle.draw();
        System.out.println();

        System.out.println("Shape: " + clonedRectangle.getType());
        clonedRectangle.draw();
        System.out.println();

        System.out.println("Shape: " + clonedSquare.getType());
        clonedSquare.draw();
    }
}
