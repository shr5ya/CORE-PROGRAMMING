import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double sum = 0, input;
            while ((input = sc.nextDouble()) != 0) {
                sum += input;
            }
            System.out.println("Total sum: " + sum);
        }
    }
}
