public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 29, i = 2;
        boolean isPrime = true;
        
        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");
    }
}
