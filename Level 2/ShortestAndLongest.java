import java.util.Scanner;


public class ShortestAndLongest {

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

    public static int[] findShortestAndLongest(String[][] wordsAndLengths) {
        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;

        if (wordsAndLengths.length == 0) {
            return new int[]{0, 0};
        }

        for (String[] row : wordsAndLengths) {
            int length = Integer.parseInt(row[1]);
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Find Shortest and Longest Words ---");
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        String[][] wordsAndLengths = getWordsWithLengths(words);

        if (wordsAndLengths.length == 0) {
            System.out.println("No words entered.");
            scanner.close();
            return;
        }

        int[] minMax = findShortestAndLongest(wordsAndLengths);

        System.out.println("\nShortest word length: " + minMax[0]);
        System.out.println("Longest word length: " + minMax[1]);

        scanner.close();
    }
}
