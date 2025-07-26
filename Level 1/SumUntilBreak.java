import java.util.Scanner;

public class SumUntilBreak {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double sum = 0;
            while (true) {
                double input = sc.nextDouble();
                if (input <= 0) break;
                sum += input;
            }
            System.out.println("Total sum: " + sum);
        }
    }
}
