import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        
        System.out.println("Original list: " + names);
        
        // Sort using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));
        
        System.out.println("Sorted list: " + names);
        
        // Alternative using List.sort()
        names.sort((a, b) -> b.compareTo(a)); // Reverse order
        System.out.println("Reverse sorted: " + names);
    }
}