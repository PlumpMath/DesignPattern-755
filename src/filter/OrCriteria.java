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

        secondCriteriaPersons.stream().filter(person -> !firstCriteriaPersons.contains(person)).forEach(firstCriteriaPersons::add);

        return firstCriteriaPersons;
    }
}
