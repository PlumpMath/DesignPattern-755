package ServiceLocator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Cache to store references of services to reuse them.
 */
public class Cache {

    private List<Service> services;

    public Cache() {
        System.out.println("Creating cache.");
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        Optional<Service> service = services.stream().filter(s -> s.getName().equalsIgnoreCase(serviceName))
                .findFirst();

        if (service.isPresent()) {
            System.out.println("Returning cached " + serviceName + " object.");
            return service.get();
        } else {
            return null;
        }
    }

    public void addService(Service newService) {
        if (!services.stream().anyMatch(s -> s.getName().equalsIgnoreCase(newService.getName()))) {
            services.add(newService);
        }
    }
}
