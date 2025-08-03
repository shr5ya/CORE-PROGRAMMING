import java.util.Arrays;
import java.util.Scanner;

class UniqueCharacters {
    
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            char currentChar = text.charAt(i);
            
            for (int j = 0; j < uniqueCount; j++) {
                if (currentChar == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to find unique characters: ");
        String input = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(input);
        
        System.out.println("The unique characters are: " + Arrays.toString(uniqueChars));
        scanner.close();
    }
}
