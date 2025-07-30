public class QuadraticRoots {
    public static double[] findQuadraticRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[0];
        if (delta == 0) return new double[]{ -b / (2 * a) };
        double sqrtD = Math.sqrt(delta);
        return new double[]{ (-b + sqrtD) / (2 * a), (-b - sqrtD) / (2 * a) };
    }
}