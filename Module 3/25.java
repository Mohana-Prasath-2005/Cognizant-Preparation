import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        
        while (true) {
            System.out.print("Enter student ID (or -1 to finish): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            if (id == -1) {
                break;
            }
            
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            studentMap.put(id, name);
        }
        
        System.out.print("\nEnter ID to lookup: ");
        int lookupId = scanner.nextInt();
        String studentName = studentMap.get(lookupId);
        
        if (studentName != null) {
            System.out.println("Student found: " + studentName);
        } else {
            System.out.println("No student found with ID " + lookupId);
        }
    }
}