package filter;

import java.util.List;

/**
 * Ceriteria interface
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> personList);
}
