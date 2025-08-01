import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateIllegalArgumentException(String text) {
        System.out.println("\n--- Generating IllegalArgumentException ---");
        System.out.println("Trying to get a substring with start index > end index...");
       
    }

    public static void handleIllegalArgumentException(String text) {
        System.out.println("\n--- Handling IllegalArgumentException ---");
        try {
            System.out.println("Trying to get substring from index 5 to 2...");
            String sub = text.substring(5, 2);
            System.out.println("Substring is: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getClass().getName());
            System.out.println("Message: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- IllegalArgumentException Demonstration ---");
        System.out.print("Enter a string (e.g., 'Hello World'): ");
        String text = scanner.nextLine();

        handleIllegalArgumentException(text);

        scanner.close();
    }
}
