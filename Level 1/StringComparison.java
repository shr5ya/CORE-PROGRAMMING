import java.util.Scanner;

public class StringComparison {

    public static boolean compareStrings(String s1, String s2) {
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

        System.out.println("--- String Comparison Program ---");
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        boolean customCompareResult = compareStrings(str1, str2);
        boolean builtinCompareResult = str1.equals(str2);

        System.out.println("Custom method result: " + customCompareResult);
        System.out.println("Built-in method result: " + builtinCompareResult);
        System.out.println("Are the results the same? " + (customCompareResult == builtinCompareResult));

        scanner.close();
    }
}
