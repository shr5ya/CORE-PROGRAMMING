import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num >= 0) {
                long fact = 1;
                int i = 1;
                while (i <= num) {
                    fact *= i;
                    i++;
                }
                System.out.println("Factorial is " + fact);
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
