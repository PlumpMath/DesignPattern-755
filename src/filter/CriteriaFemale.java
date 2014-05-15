package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Female criteria will filter out all the males
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : personList) {
            if (person.getGender() == Gender.FEMALE) {
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}
