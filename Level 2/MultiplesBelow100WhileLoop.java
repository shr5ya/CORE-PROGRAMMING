import java.util.Scanner;

public class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number less than 100: ");
            int number = sc.nextInt();
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0)
                    System.out.println(counter);
                counter--;
            }
        }
    }
}
