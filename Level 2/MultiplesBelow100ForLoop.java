import java.util.Scanner;

public class MultiplesBelow100ForLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number less than 100: ");
            int number = sc.nextInt();
            if (number >= 100 || number <= 0) {
                System.out.println("Enter number between 1 and 99");
                return;
            }
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0)
                    System.out.println(i);
            }
        }
    }
}
