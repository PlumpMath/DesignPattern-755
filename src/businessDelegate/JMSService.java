package businessDelegate;

/**
 * JMSService is a business service
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS service.");
    }
}
