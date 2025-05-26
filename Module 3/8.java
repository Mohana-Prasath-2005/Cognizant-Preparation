public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1 + " (Multiplication is done first)");
        
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2 + " (Parentheses are evaluated first)");
        
        int result3 = 10 + 5 * 2 - 4 / 2;
        System.out.println("10 + 5 * 2 - 4 / 2 = " + result3 + " (* and / have higher precedence than + and -)");
    }
}