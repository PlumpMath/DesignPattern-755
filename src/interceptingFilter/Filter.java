package interceptingFilter;

/**
 * Filter which perform certain task prior or after execution of request by request handler.
 */
public interface Filter {
    public void execute(String request);
}
