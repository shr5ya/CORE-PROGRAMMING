import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num >= 0) {
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Factorial is " + fact);
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
