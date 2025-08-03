import java.util.Scanner;

class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeating(String text) {
        int length = text.length();
        int[] frequency = new int[256];
        
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }
        
        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find the first non-repeating character: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        scanner.close();
    }
}
