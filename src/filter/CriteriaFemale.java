package filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Female criteria will filter out all the males
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(person -> person.getGender() == Gender.FEMALE).collect(Collectors.toList());
    }
}
