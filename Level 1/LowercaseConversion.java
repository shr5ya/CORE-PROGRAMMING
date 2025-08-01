import java.util.Scanner;

public class LowercaseConversion {

    public static String toLowercaseManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
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
        System.out.println("--- Manual Lowercase Conversion Program ---");
        System.out.print("Enter a text to convert to lowercase: ");
        String textToLowercase = scanner.nextLine();

        String customLowercase = toLowercaseManual(textToLowercase);
        String builtinLowercase = textToLowercase.toLowerCase();

        System.out.println("Custom lowercase: " + customLowercase);
        System.out.println("Built-in lowercase: " + builtinLowercase);
        System.out.println("Are the results the same? " + compareStrings(customLowercase, builtinLowercase));

        scanner.close();
    }
}
