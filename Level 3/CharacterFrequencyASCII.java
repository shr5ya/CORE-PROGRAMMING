import java.util.Scanner;

class CharacterFrequencyASCII {

    public static String[][] findFrequency(String text) {
        int length = text.length();
        int[] frequency = new int[256];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] == 0) {
                uniqueCount++;
            }
            frequency[text.charAt(i)]++;
        }

        String[][] result = new String[uniqueCount][2];
        int resultIndex = 0;
        boolean[] counted = new boolean[256];

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (!counted[currentChar]) {
                result[resultIndex][0] = String.valueOf(currentChar);
                result[resultIndex][1] = String.valueOf(frequency[currentChar]);
                counted[currentChar] = true;
                resultIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find character frequencies: ");
        String input = scanner.nextLine();
        
        String[][] frequencies = findFrequency(input);
        
        System.out.println("Character Frequencies:");
        for (String[] freq : frequencies) {
            System.out.println("'" + freq[0] + "': " + freq[1]);
        }
        scanner.close();
    }
}
