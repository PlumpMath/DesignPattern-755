package nullObject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Customer factory is responsible for retrieving customers from database by name
 */
public class CustomerFactory {

    public static final List<String> names = Arrays.asList("Rob", "Joe", "Julie");

    public static AbstractCustomer getCustomer(String name) {

        Optional<String> optionalName = names.stream().filter(n -> n.equalsIgnoreCase(name)).findFirst();

        if (optionalName.isPresent()) {
            return new RealCustomer(optionalName.get());
        } else {
            return  new NullCustomer();
        }
    }
}
