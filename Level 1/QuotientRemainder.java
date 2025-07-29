import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number and divisor: ");
            int number = sc.nextInt();
            int divisor = sc.nextInt();
            int[] res = findRemainderAndQuotient(number, divisor);
            System.out.println("Remainder: " + res[0] + ", Quotient: " + res[1]);
        }
    }
}