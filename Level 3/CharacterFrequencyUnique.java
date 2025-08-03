import java.util.Scanner;

class CharacterFrequencyUnique {

    public static char[] findUniqueCharacters(String text) {
        boolean[] seen = new boolean[256];
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                unique.append(c);
            }
        }
        return unique.toString().toCharArray();
    }

    public static String[][] findFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(frequency[c]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find frequency of unique characters: ");
        String input = scanner.nextLine();

        String[][] frequencies = findFrequency(input);

        System.out.println("Frequency of unique characters:");
        for (String[] freq : frequencies) {
            System.out.println("'" + freq[0] + "': " + freq[1]);
        }
        scanner.close();
    }
}
