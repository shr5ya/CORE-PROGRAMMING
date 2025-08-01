import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        System.out.println("\n--- Generating ArrayIndexOutOfBoundsException ---");
        System.out.println("Trying to access an index beyond the array's length...");
        // System.out.println("Name at index " + names.length + " is: " + names[names.length]);
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names, int index) {
        System.out.println("\n--- Handling ArrayIndexOutOfBoundsException ---");
        try {
            System.out.println("Trying to access index " + index + " in an array of size " + names.length + "...");
            System.out.println("Name at index " + index + " is: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getClass().getName());
            System.out.println("Message: Array index is out of bounds.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- ArrayIndexOutOfBoundsException Demonstration ---");
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.print("Enter an invalid array index (e.g., 3): ");
        int invalidIndex = scanner.nextInt();

        handleArrayIndexOutOfBoundsException(names, invalidIndex);

        scanner.close();
    }
}

