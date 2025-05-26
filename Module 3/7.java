public class TypeCastingExample {
    public static void main(String[] args) {
        // Double to int
        double doubleValue = 9.87;
        int intValue = (int) doubleValue;
        System.out.println("Double " + doubleValue + " cast to int: " + intValue);
        
        // Int to double
        int anotherInt = 5;
        double anotherDouble = (double) anotherInt;
        System.out.println("Int " + anotherInt + " cast to double: " + anotherDouble);
    }
}