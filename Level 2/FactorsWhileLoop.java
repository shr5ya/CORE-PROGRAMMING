import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            int number = sc.nextInt();
            int i = 1;
            while (i <= number) {
                if (number % i == 0)
                    System.out.println(i);
                i++;
            }
        }
    }
}
