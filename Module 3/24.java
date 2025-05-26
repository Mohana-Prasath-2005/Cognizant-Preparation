import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter student name (or 'quit' to finish): ");
            String name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("quit")) {
                break;
            }
            studentNames.add(name);
        }
        
        System.out.println("\nStudent List:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}