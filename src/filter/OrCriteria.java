package filter;

import java.util.List;

/**
 * Disjunction with two criteria
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(personList);
        List<Person> secondCriteriaPersons = otherCriteria.meetCriteria(personList);

        for (Person person : secondCriteriaPersons) {
            if (!firstCriteriaPersons.contains(person)) {
                firstCriteriaPersons.add(person);
            }
        }

        return firstCriteriaPersons;
    }
}
