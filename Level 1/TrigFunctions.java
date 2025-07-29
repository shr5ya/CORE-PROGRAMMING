import java.util.Scanner;
public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter angle in degrees: ");
            double angle = sc.nextDouble();
            double[] results = calculateTrigonometricFunctions(angle);
            System.out.printf("Sine: %.2f, Cosine: %.2f, Tangent: %.2f\n", results[0], results[1], results[2]);
        }
    }
}
