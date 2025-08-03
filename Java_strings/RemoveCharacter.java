package Java_strings;

import java.util.Scanner;

class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != charToRemove) {
                result += input.charAt(i);
            }
        }
        System.out.println("Modified String: " + result);
        scanner.close();
    }
}
