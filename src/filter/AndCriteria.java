package filter;

import java.util.List;

/**
 * Conjunction with two criteria.
 */
public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCritera;

    public AndCriteria(Criteria criteria, Criteria otherCritera) {
        this.criteria = criteria;
        this.otherCritera = otherCritera;
    }


    @Override
    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> firstCriteriaPersons = criteria.meetCriteria(personList);
        return otherCritera.meetCriteria(firstCriteriaPersons);
    }
}
