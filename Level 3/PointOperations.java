import java.util.Scanner;

public class PointOperations {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = getDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.4f%n", distance);

        double[] line = getLineEquation(x1, y1, x2, y2);
        System.out.printf("Line Equation: y = %.2fx + %.2f%n", line[0], line[1]);

        sc.close();
    }
}
