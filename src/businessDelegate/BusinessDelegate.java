package businessDelegate;

/**
 * Responsible for invoking corresponding service. It is a single entry point class for client entities to provide
 * access to business service methods.
 */
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        BusinessService businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
