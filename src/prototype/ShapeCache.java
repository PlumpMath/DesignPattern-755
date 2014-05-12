package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * A cache stores all {@code Shape} objects
 */
public class ShapeCache {

    /**
     * Key: shape name; Value: Shape object
     */
    private static Map<Shapes, Shape> shapeMap = new HashMap<Shapes, Shape>();

    public static Shape getShape(Shapes shapeName) {
        if (shapeMap.containsKey(shapeName)) {
            Shape cachedShape = shapeMap.get(shapeName);
            return (Shape) cachedShape.clone();
        }

        return null;
    }

    public static void loadCache() {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectange = new Rectangle();

        shapeMap.put(Shapes.CIRCLE, circle);
        shapeMap.put(Shapes.SQUARE, square);
        shapeMap.put(Shapes.RECTANGLE, rectange);

    }
}
