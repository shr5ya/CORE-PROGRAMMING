import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Take input

        if (number < 1) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }

        sc.close(); // ✅ Close the Scanner to prevent resource leak
    }
}
