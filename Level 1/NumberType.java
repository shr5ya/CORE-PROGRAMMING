import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number > 0) System.out.println("Positive");
            else if (number < 0) System.out.println("Negative");
            else System.out.println("Zero");
        }
    }
}
