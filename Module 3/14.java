import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();
        
        double[] numbers = new double[count];
        double sum = 0;
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        
        double average = sum / count;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}