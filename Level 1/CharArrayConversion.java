import java.util.Arrays;
import java.util.Scanner;

public class CharArrayConversion {

    public static char[] getCharacters(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Character Array Conversion Program ---");
        System.out.print("Enter a string to convert to a character array: ");
        String textForChar = scanner.next();

        char[] customCharArray = getCharacters(textForChar);
        char[] builtinCharArray = textForChar.toCharArray();

        System.out.println("Custom char array: " + Arrays.toString(customCharArray));
        System.out.println("Built-in char array: " + Arrays.toString(builtinCharArray));
        System.out.println("Are the arrays the same? " + compareCharArrays(customCharArray, builtinCharArray));

        scanner.close();
    }
}
