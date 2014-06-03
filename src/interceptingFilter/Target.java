package interceptingFilter;

/**
 * Target object is the request handler
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
