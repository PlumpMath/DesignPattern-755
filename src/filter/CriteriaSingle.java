package filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Includes only single person
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(person -> person.getMaritalStatus() == MaritalStatus.SINGLE).collect(Collectors.toList());
    }
}
