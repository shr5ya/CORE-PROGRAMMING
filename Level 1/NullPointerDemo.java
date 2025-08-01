public class NullPointerDemo {

    public static void generateNullPointerException() {
        System.out.println("\n--- Generating NullPointerException ---");
        String text = null;
        System.out.println("Attempting to get the length of a null string...");
        // int length = text.length(); 
    }

    public static void handleNullPointerException() {
        System.out.println("\n--- Handling NullPointerException ---");
        String text = null;
        try {
            System.out.println("Attempting to get the length of a null string...");
            int length = text.length();
            System.out.println("The length is: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getClass().getName());
            System.out.println("Message: Cannot invoke \"String.length()\" because \"text\" is null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- NullPointerException Demonstration ---");
        handleNullPointerException();
    }
}

