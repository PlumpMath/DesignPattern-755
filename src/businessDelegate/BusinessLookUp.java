package businessDelegate;

/**
 * Responsible to get relative business implementation and provide business object access to business delegate object.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
