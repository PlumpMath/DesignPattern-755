package frontController;

/**
 * Demonstrates front controller pattern. This design pattern is used to provide a centralized request handling
 * mechanism so that all requests will be handled by a single handler. This handler can do the
 * authentication/authorization/logging or tracking of request and then pass the requests to corresponding handlers.
 */
public class Demo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
