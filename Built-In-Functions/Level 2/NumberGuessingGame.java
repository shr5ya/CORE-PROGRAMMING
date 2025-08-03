import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it. You provide the feedback.");
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'high', 'low', or 'correct': ");
            feedback = scanner.nextLine().trim().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Great! The computer guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
                System.out.println("Okay, I'll guess a lower number.");
            } else if (feedback.equals("low")) {
                low = guess + 1;
                System.out.println("Okay, I'll guess a higher number.");
            } else {
                System.out.println("Invalid feedback. Please enter 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Something went wrong. It seems you didn't provide correct feedback.");
                break;
            }
        }
        scanner.close();
    }
    
    public static int generateGuess(int low, int high, Random random) {
        return low + (high - low) / 2;
    }
}
