import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println("\n--- Generating StringIndexOutOfBoundsException ---");
        System.out.println("Trying to access an index beyond the string's length...");
        // char c = text.charAt(text.length());
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        System.out.println("\n--- Handling StringIndexOutOfBoundsException ---");
        try {
            System.out.println("Trying to access index " + text.length() + " on string of length " + text.length() + "...");
            char c = text.charAt(text.length());
            System.out.println("Character at index " + text.length() + " is: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getClass().getName());
            System.out.println("Message: String index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- StringIndexOutOfBoundsException Demonstration ---");
        System.out.print("Enter a string (e.g., 'Hello'): ");
        String text = scanner.next();

        handleStringIndexOutOfBoundsException(text);

        scanner.close();
    }
}
