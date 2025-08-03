import java.util.Scanner;

public class VowelConsonantCounter {

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

    public static String isVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32;
        }

        if (ch >= 'a' && ch <= 'z') {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return "Vowel";
                default:
                    return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        int len = getLength(str);

        for (int i = 0; i < len; i++) {
            String type = isVowelOrConsonant(str.charAt(i));
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Count Vowels and Consonants ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(input);

        System.out.println("Vowel count: " + counts[0]);
        System.out.println("Consonant count: " + counts[1]);

        scanner.close();
    }
}
