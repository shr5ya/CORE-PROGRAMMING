import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateNumberFormatException(String text) {
        System.out.println("\n--- Generating NumberFormatException ---");
        System.out.println("Trying to parse a non-numeric string to an integer...");
        
    }

    public static void handleNumberFormatException(String text) {
        System.out.println("\n--- Handling NumberFormatException ---");
        try {
            System.out.println("Trying to parse '" + text + "' to an integer...");
            int number = Integer.parseInt(text);
            System.out.println("The parsed number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getClass().getName());
            System.out.println("Message: Invalid input for integer parsing.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- NumberFormatException Demonstration ---");
        System.out.print("Enter a non-numeric string (e.g., 'abc'): ");
        String nonNumericInput = scanner.next();

        handleNumberFormatException(nonNumericInput);

        scanner.close();
    }
}
