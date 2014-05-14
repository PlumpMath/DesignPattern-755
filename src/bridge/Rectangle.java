package bridge;

/**
 * Rectangle class
 */
public class Rectangle extends Shape{

    private int x, y, width, height;

    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(color, "Rectangle");
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle: [x: " + x + ", y:" + y + ", width:" + width + ", height:" + height + "].");
        color.fillColor(this);
    }
}
