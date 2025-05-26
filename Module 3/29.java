import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 20),
            new Person("David", 35)
        );
        
        System.out.println("All people:");
        people.forEach(System.out::println);
        
        // Filter people older than 25 using Streams
        List<Person> olderThan25 = people.stream()
                                      .filter(p -> p.age() > 25)
                                      .collect(Collectors.toList());
        
        System.out.println("\nPeople older than 25:");
        olderThan25.forEach(System.out::println);
    }
}