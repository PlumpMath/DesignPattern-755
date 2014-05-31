package compositeEntity;

/**
 * Demonstrates composite entity pattern
 */
public class Demo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();

        client.setData("Second Test", "Second Data");
        client.printData();
    }
}
