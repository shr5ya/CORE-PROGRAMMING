import java.util.Arrays;
import java.util.Scanner;

class PalindromeChecker {

    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }
    
    public static char[] reverseString(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        int j = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reversed[j++] = original[i];
        }
        return reversed;
    }
    
    public static boolean isPalindromeLogic3(String text) {
        char[] originalChars = text.toCharArray();
        char[] reversedChars = reverseString(text);
        
        return Arrays.equals(originalChars, reversedChars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        boolean isPalindrome1 = isPalindromeLogic1(input);
        System.out.println("Logic 1 (start/end comparison): " + (isPalindrome1 ? "Palindrome" : "Not a Palindrome"));
        
        boolean isPalindrome2 = isPalindromeLogic2(input, 0, input.length() - 1);
        System.out.println("Logic 2 (recursion): " + (isPalindrome2 ? "Palindrome" : "Not a Palindrome"));
        
        boolean isPalindrome3 = isPalindromeLogic3(input);
        System.out.println("Logic 3 (character arrays): " + (isPalindrome3 ? "Palindrome" : "Not a Palindrome"));
        scanner.close();
    }
}
