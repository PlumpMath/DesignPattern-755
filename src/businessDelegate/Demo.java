package businessDelegate;

/**
 * Demonstrates business delegate pattern. Business Delegate Pattern is used to decouple presentation tier and
 * business tier. It is basically used to reduce communication or remote lookup functionality to business tier code
 * in presentation tier code.
 */
public class Demo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
