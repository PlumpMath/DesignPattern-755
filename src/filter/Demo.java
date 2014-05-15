package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates filter pattern. This pattern is not a classic pattern in Gof book.
 */
public class Demo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("John", Gender.MALE, MaritalStatus.MARRIED));
        persons.add(new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED));
        persons.add(new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE));
        persons.add(new Person("Mike", Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("Bobby", Gender.MALE, MaritalStatus.SINGLE));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));
        System.out.println();

        System.out.println("Female:");
        printPersons(female.meetCriteria(persons));
        System.out.println();

        System.out.println("Single Male:");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println();

        System.out.println("Single or Female:");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    private static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Persons : [Name: " + person.getName()
                    + ", Gender: " + person.getGender()
                    + ", Marital Status: " + person.getMaritalStatus()
                    + "]");
        }
    }
}
