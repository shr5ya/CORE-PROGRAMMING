public class UnitConverter {
    public static double kmToMiles(double km) { return km * 0.621371; }
    public static double milesToKm(double mi) { return mi * 1.60934; }
    public static double metersToFeet(double m) { return m * 3.28084; }
    public static double feetToMeters(double f) { return f * 0.3048; }
    public static double yardsToFeet(double y) { return y * 3; }
    public static double feetToYards(double f) { return f * 0.333333; }
    public static double metersToInches(double m) { return m * 39.3701; }
    public static double inchesToMeters(double i) { return i * 0.0254; }
    public static double inchesToCm(double i) { return i * 2.54; }
    public static double fahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double celsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }
    public static double poundsToKg(double p) { return p * 0.453592; }
    public static double kgToPounds(double k) { return k * 2.20462; }
    public static double gallonsToLiters(double g) { return g * 3.78541; }
    public static double litersToGallons(double l) { return l * 0.264172; }
}