package proxy;

/**
 * Demonstrates proxy pattern. Proxy class is supposed to reduce memory footprint of real object loading.
 */
public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_1.png");

        //Image will be loaded from disk
        image.display();
        System.out.println();

        //Image will not be loaded from disk
        image.display();
    }
}
