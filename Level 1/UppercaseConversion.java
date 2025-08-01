import java.util.Scanner;

public class UppercaseConversion {

    public static String toUppercaseManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Manual Uppercase Conversion Program ---");
        System.out.print("Enter a text to convert to uppercase: ");
        String textToUppercase = scanner.nextLine();

        String customUppercase = toUppercaseManual(textToUppercase);
        String builtinUppercase = textToUppercase.toUpperCase();

        System.out.println("Custom uppercase: " + customUppercase);
        System.out.println("Built-in uppercase: " + builtinUppercase);
        System.out.println("Are the results the same? " + compareStrings(customUppercase, builtinUppercase));

        scanner.close();
    }
}
