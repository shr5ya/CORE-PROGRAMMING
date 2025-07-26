import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            int number = sc.nextInt();
            int i = 1;
            while (i <= number) {
                if (i % 15 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
                i++;
            }
        }
    }
}
