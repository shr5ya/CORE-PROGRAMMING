package Java_strings;

import java.util.Scanner;

class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] frequency = new int[256];
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        char mostFrequentChar = ' ';
        int maxFrequency = -1;
        for (int i = 0; i < input.length(); i++) {
            if (frequency[input.charAt(i)] > maxFrequency) {
                maxFrequency = frequency[input.charAt(i)];
                mostFrequentChar = input.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        scanner.close();
    }
}
