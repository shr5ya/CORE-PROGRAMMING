import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            int number = sc.nextInt();
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        }
    }
}
