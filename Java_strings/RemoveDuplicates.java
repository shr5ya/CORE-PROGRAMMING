package Java_strings;

import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with duplicates: ");
        String input = scanner.nextLine();
        String result = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.indexOf(ch) < 0) {
                result += ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);
        scanner.close();
    }
}
