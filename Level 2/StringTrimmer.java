import java.util.Scanner;

public class StringTrimmer {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String mySubstring(String str, int start, int end) {
        if (start < 0 || end > getLength(str) || start > end) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static String trimSpaces(String str) {
        int len = getLength(str);
        if (len == 0) return "";

        int start = 0;
        while (start < len && str.charAt(start) == ' ') {
            start++;
        }

        int end = len - 1;
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return mySubstring(str, start, end + 1);
    }
    
    public static boolean compareStrings(String s1, String s2) {
        if (getLength(s1) != getLength(s2)) {
            return false;
        }
        for (int i = 0; i < getLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Trim Leading/Trailing Spaces ---");
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = scanner.nextLine();

        String myTrimmedString = trimSpaces(input);
        String builtInTrimmedString = input.trim();
        boolean areEqual = compareStrings(myTrimmedString, builtInTrimmedString);

        System.out.println("\nOriginal String: '" + input + "'");
        System.out.println("User-defined trim: '" + myTrimmedString + "'");
        System.out.println("Built-in trim(): '" + builtInTrimmedString + "'");
        System.out.println("\nResult of comparison: " + areEqual);

        scanner.close();
    }
}
