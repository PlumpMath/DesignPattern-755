package flyweight;

/**
 * Circle class implements shape.
 */
public class Circle implements Shape{
    private Colors color;
    private int x, y;
    private int radius;

    public Circle(Colors color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle with color " + color.toString().toLowerCase() + " at {" + x + ", " + y + "}.");
    }

}
