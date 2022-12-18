import org.junit.jupiter.api.*;

@DisplayName("Тест: PersonCompare")
public class PersonCompareTest {

    private PersonCompare personCompare;
    private Person person1;
    private Person person2;

    @BeforeAll
    static void startTest() {
        System.out.println("Тестирование начато");
    }

    @BeforeEach
    void setUp() {
        personCompare = new PersonCompare(1);
        person1 = new Person("Petya", "Ivanov", 21);
        person2 = new Person("Anya", "Vladimirovna Kovaleva", 20);
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Тестирование закончено");
    }

    @Test
    @DisplayName("Проверка знатности 1")
    void personCompare1() {
        Assertions.assertEquals(-1, personCompare.compare(person1, person2));
        System.out.println("Тест знатности-1 прошел успешно!");
    }

    @Test
    @DisplayName("Проверка сравнения возраста")
    void ageCompare() {
        Assertions.assertEquals(1, personCompare.ageCompare(person2.getAge(), person1.getAge()));
        System.out.println("Тест сравнения возраста прошел успешно!");
    }

    @Test
    @DisplayName("Проверка знатности 2")
    void personCompare2() {
        Person person3 = new Person("Andrei", "Ivanov Ivanovich", 21);
        Person person4 = new Person("Pavel", "Smirnov Vasiliev Komarov", 5);
        PersonCompare personCompare1 = new PersonCompare(2);
        Assertions.assertEquals(1, personCompare1.compare(person4, person3));
        System.out.println("Тест знатности-2 прошел успешно!");
    }
}
