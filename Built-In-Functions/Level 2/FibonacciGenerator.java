import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Number of terms cannot be negative.");
        } else {
            generateFibonacci(n);
        }

        scanner.close();
    }
    
    public static void generateFibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Sequence: ");

        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(", " + b);
        }

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(", " + nextTerm);
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}
