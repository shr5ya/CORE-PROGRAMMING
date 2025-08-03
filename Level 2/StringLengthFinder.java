import java.util.Scanner;


public class StringLengthFinder {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Find String Length ---");
        System.out.print("Enter a string: ");
        String input = scanner.next();
        scanner.nextLine();

        int myLength = getLength(input);
        int builtInLength = input.length();

        System.out.println("User-defined length: " + myLength);
        System.out.println("Built-in length(): " + builtInLength);
        System.out.println("Lengths are equal: " + (myLength == builtInLength));
        
        scanner.close();
    }
}
