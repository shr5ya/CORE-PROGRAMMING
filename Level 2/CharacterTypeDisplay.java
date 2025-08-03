import java.util.Scanner;

public class CharacterTypeDisplay {

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

    public static String[][] getCharacterTypes(String str) {
        int len = getLength(str);
        String[][] charTypes = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            charTypes[i][0] = String.valueOf(ch);
            charTypes[i][1] = isVowelOrConsonant(ch);
        }
        return charTypes;
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
        System.out.println("--- Program: Display Character Type ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] charTypes = getCharacterTypes(input);

        System.out.println("\nCharacter types:");
        displayTable(charTypes, new String[]{"Character", "Type"});

        scanner.close();
    }
}
