import java.util.Scanner;

public class TextSplitter {

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

    public static String[] splitWords(String text) {
        int len = getLength(text);
        if (len == 0) {
            return new String[0];
        }

        int wordCount = 0;
        if (len > 0 && text.charAt(0) != ' ') {
            wordCount = 1;
        }
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ' && i + 1 < len && text.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                if (i > start) {
                    words[wordIndex] = text.substring(start, i);
                    wordIndex++;
                }
                start = i + 1;
            }
        }
        if (start < len) {
            words[wordIndex] = text.substring(start, len);
        }
        return words;
    }
    
    private static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Split Text into Words ---");
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] myWords = splitWords(input);
        String[] builtInWords = input.split(" ");
        boolean areEqual = compareStringArrays(myWords, builtInWords);

        System.out.println("\nUser-defined split words:");
        for (String word : myWords) {
            System.out.println("- " + word);
        }

        System.out.println("\nBuilt-in split() words:");
        for (String word : builtInWords) {
            System.out.println("- " + word);
        }

        System.out.println("\nResult of comparison: " + areEqual);

        scanner.close();
    }
}
