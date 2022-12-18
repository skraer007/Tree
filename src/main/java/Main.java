import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Petya", "Ivanov Petrov", 15));
        people.add(new Person("Anya", "Ivanova Smirnova Kukushkina", 8));
        people.add(new Person("Danya", "Vavilov Korol Vtoroi", 20));
        people.add(new Person("Stas", "Vasiliev", 5));
        Collections.sort(people, new PersonCompare(2));
        System.out.println(people);
    }
}