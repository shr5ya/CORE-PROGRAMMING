package Java_strings;

import java.util.Scanner;

class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();

        String result = replace(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + result);
        scanner.close();
    }
    
    public static String replace(String sentence, String oldWord, String newWord) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (word.equals(oldWord)) {
                result.append(newWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}
