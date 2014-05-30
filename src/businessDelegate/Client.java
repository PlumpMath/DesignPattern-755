package businessDelegate;

/**
 * Client is presentation tier code. It could be JSP, servlet or UI java code.
 */
public class Client {

    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
