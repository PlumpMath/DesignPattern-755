package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Includes only single person
 */
public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : personList) {
            if (person.getMaritalStatus() == MaritalStatus.SINGLE) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
