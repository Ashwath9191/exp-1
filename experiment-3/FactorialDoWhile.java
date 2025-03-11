public class FactorialDoWhile {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
