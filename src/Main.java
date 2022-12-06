import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person personPetya = new Person("Petya", "Ivanov Petrov", 15);
        Person personAnya = new Person("Anya", "Ivanova Smirnova Kukushkina", 8);
        Person personDanya = new Person("Danya", "Vavilov Korol Vtoroi", 20);
        Person personStas = new Person("Stas", "Vasiliev", 5);
        people.add(personPetya);
        people.add(personAnya);
        people.add(personDanya);
        people.add(personStas);
        System.out.println(people);
        Comparator<Person> personCompare = (person1, person2) -> {
            String[] surnameParts1 = person1.getSurname().split(" ");
            String[] surnameParts2 = person2.getSurname().split(" ");
            if (surnameParts1.length > surnameParts2.length) {
                return -1;
            } else if (surnameParts1.length < surnameParts2.length) {
                return 1;
            } else {
                return person1.getAge() > person2.getAge() ? -1 : 1;
            }
        };

        Collections.sort(people, personCompare);
        System.out.println(people);
    }
}