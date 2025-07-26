import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n >= 0) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                int formulaSum = n * (n + 1) / 2;
                System.out.println("Sum using loop: " + sum);
                System.out.println("Sum using formula: " + formulaSum);
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
