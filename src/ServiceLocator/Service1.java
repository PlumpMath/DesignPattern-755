package ServiceLocator;

/**
 * Actual service which will process the request.
 */
public class Service1 implements Service {

    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1.");
    }
}
