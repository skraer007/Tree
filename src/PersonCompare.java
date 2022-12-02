import java.util.Comparator;

public class PersonCompare implements Comparator<Person> {
    private int maxParts;

    @Override
    public int compare(Person person1, Person person2) {
        String[] surnameParts1 = person1.getSurname().split(" ");
        String[] surnameParts2 = person2.getSurname().split(" ");
        if (surnameParts1.length >= maxParts & surnameParts2.length >= maxParts) {
            return ageCompare(person1.getAge(), person2.getAge());
        }
        if (surnameParts1.length > surnameParts2.length) {
            return -1;
        } else if (surnameParts2.length > surnameParts1.length) {
            return 1;
        } else {
            return ageCompare(person1.getAge(), person2.getAge());
        }
    }

    public int ageCompare(int age1, int age2) {
        if (age1 > age2) {
            return -1;
        } else return 1;
    }

    public PersonCompare(int maxParts) {
        this.maxParts = maxParts;
    }
}