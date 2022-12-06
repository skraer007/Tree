import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Petya", "Ivanov Petrov", 15));
        people.add(new Person("Anya", "Ivanova Smirnova Kukushkina", 8));
        people.add(new Person("Danya", "Vavilov Korol Vtoroi", 20));
        people.add(new Person("Stas", "Vasiliev", 30));
        System.out.println(people);
        Collections.sort(people, new PersonCompare(2));
        Predicate<Person> checkAge = person -> person.getAge() < 18;
        people.removeIf(checkAge);
        System.out.println(people);
    }
}