package bridge;

/**
 * Circle extends {@code Shape} class
 */
public class Circle extends Shape{

    private int x, y, radius;

    public Circle(int x, int y, int radius, Color color) {
        super(color, "Circle");
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle: [x: " + x + ", y: " + y + ", radius:" + radius + "].");
        color.fillColor(this);
    }
}
