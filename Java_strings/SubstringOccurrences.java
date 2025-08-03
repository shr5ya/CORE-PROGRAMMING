package Java_strings;

import java.util.Scanner;

class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();
        
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = mainString.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subString.length();
            }
        }
        System.out.println("The substring occurs " + count + " times.");
        scanner.close();
    }
}
