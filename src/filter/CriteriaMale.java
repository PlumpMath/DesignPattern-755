package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Male criteria will filter out all the females
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(person -> person.getGender() == Gender.MALE).collect(Collectors.toList());
    }
}
