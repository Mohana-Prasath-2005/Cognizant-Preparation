public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 3));
        System.out.println("Sum of two doubles: " + add(2.5, 3.7));
        System.out.println("Sum of three integers: " + add(1, 2, 3));
    }
}