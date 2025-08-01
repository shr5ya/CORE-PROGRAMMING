import java.util.Scanner;

public class SubstringCreation {

    public static String createSubstring(String text, int startIndex, int endIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            sb.append(text.charAt(i));
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

        System.out.println("--- Substring Creation Program ---");
        System.out.print("Enter a string for substring: ");
        String textForSub = scanner.next();
        System.out.print("Enter a start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter an end index: ");
        int end = scanner.nextInt();

        String customSubstring = createSubstring(textForSub, start, end);
        String builtinSubstring = textForSub.substring(start, end);

        System.out.println("Custom substring: '" + customSubstring + "'");
        System.out.println("Built-in substring: '" + builtinSubstring + "'");
        System.out.println("Are the substrings the same? " + compareStrings(customSubstring, builtinSubstring));

        scanner.close();
    }
}
