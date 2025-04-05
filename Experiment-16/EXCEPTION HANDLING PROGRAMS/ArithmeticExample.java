public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
    }
}
