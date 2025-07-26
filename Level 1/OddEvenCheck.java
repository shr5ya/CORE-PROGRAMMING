import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num >= 1) {
                for (int i = 1; i <= num; i++) {
                    System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
                }
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
