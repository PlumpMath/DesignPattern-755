package ServiceLocator;

/**
 * Demonstrates service locator pattern
 */
public class Demo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();

        service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
