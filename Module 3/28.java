import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Original list: " + numbers);
        
        List<Integer> evenNumbers = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());
        
        System.out.println("Even numbers: " + evenNumbers);
        
        // Sum of even numbers
        int sum = numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .mapToInt(Integer::intValue)
                       .sum();
        
        System.out.println("Sum of even numbers: " + sum);
    }
}