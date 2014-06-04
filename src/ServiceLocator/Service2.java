package ServiceLocator;

/**
 * Actual service which will process the request. Reference of such service is to be looked upon in JNDI server
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2.");
    }
}
