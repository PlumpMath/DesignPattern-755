package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Male criteria will filter out all the females
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : personList) {
            if (person.getGender() == Gender.MALE) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
