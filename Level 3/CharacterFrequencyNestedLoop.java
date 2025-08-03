import java.util.Scanner;

class CharacterFrequencyNestedLoop {

    public static String[][] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] frequency = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '\0') { 
                frequency[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (chars[i] == chars[j]) {
                        frequency[i]++;
                        chars[j] = '\0'; 
                    }
                }
                uniqueCount++;
            }
        }
        
        String[][] result = new String[uniqueCount][2];
        int resultIndex = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '\0') {
                result[resultIndex][0] = String.valueOf(chars[i]);
                result[resultIndex][1] = String.valueOf(frequency[i]);
                resultIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find character frequencies using nested loops: ");
        String input = scanner.nextLine();

        String[][] frequencies = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (String[] freq : frequencies) {
            System.out.println("'" + freq[0] + "': " + freq[1]);
        }
        scanner.close();
    }
}
