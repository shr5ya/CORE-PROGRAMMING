import java.util.Scanner;


public class WordsAndLengths {

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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsAndLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsAndLengths[i][0] = words[i];
            wordsAndLengths[i][1] = String.valueOf(getLength(words[i]));
        }
        return wordsAndLengths;
    }

    public static void displayTable(String[][] data, String[] headers) {
        if (data.length == 0 || headers.length == 0) {
            System.out.println("No data to display.");
            return;
        }
        int[] colWidths = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            colWidths[i] = getLength(headers[i]);
        }
        for (String[] row : data) {
            for (int j = 0; j < row.length; j++) {
                if (getLength(row[j]) > colWidths[j]) {
                    colWidths[j] = getLength(row[j]);
                }
            }
        }

        System.out.print("|");
        for (int i = 0; i < headers.length; i++) {
            System.out.printf(" %-" + (colWidths[i] + 1) + "s |", headers[i]);
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < headers.length; i++) {
            System.out.printf(" %-" + (colWidths[i] + 1) + "s |", "=".repeat(colWidths[i]));
        }
        System.out.println();

        for (String[] row : data) {
            System.out.print("|");
            for (int j = 0; j < row.length; j++) {
                System.out.printf(" %-" + (colWidths[j] + 1) + "s |", row[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Split Text and Return Words with Lengths ---");
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        String[][] wordsAndLengths = getWordsWithLengths(words);

        System.out.println("\nWords and their lengths:");
        displayTable(wordsAndLengths, new String[]{"Word", "Length"});

        scanner.close();
    }
}
