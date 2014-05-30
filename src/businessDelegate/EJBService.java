package businessDelegate;

/**
 * EJBService is a business service
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB service.");
    }
}
