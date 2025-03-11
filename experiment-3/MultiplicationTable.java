public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5, i = 1;
        System.out.println("Multiplication Table of " + num + ":");
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
