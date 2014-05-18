package flyweight;

import java.util.HashMap;

/**
 * Create shapes with different colors
 */
public class ShapeFactory {
    private static final HashMap<Colors, Shape> circleMap = new HashMap<Colors, Shape>();

    public static Shape getCircle(Colors color) {
        Circle circle;

        if (circleMap.containsKey(color)) {
            circle = (Circle)circleMap.get(color);
        } else {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color.toString().toLowerCase());
        }

        return circle;
    }
}
