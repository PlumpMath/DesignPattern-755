package bridge;

/**
 * Shape abstract class plays the role of bridge. Bridge is used where we need to decouple an abstraction from its
 * implementation so that the two can vary independently.
 */
public abstract class Shape {

    protected Color color;

    protected String shapeName;

    protected Shape(Color color, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
    }

    public abstract void draw();

    public String getShapeName() {
        return shapeName;
    }
}
