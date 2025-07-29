import java.util.Scanner;
public class TriangularParkRunner {
    public static double numberOfRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 3 sides of the triangle: ");
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            double rounds = numberOfRounds(a, b, c);
            System.out.printf("The athlete must complete %.2f rounds\n", rounds);
        }
    }
}