import java.util.Scanner;
import java.text.DecimalFormat;

public class BmiCalculator {

    private static final int NUM_MEMBERS = 10;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static String[] calculateBmiAndStatus(double heightCm, double weightKg) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
            df.format(heightCm),
            df.format(weightKg),
            df.format(bmi),
            status
        };
    }

    public static String[][] computeAllBmi(double[][] inputData) {
        String[][] results = new String[NUM_MEMBERS][4];
        for (int i = 0; i < NUM_MEMBERS; i++) {
            double height = inputData[i][1];
            double weight = inputData[i][0];
            results[i] = calculateBmiAndStatus(height, weight);
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s | %-10s | %-12s\n",
                "Member", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < NUM_MEMBERS; i++) {
            System.out.printf("%-10s | %-11s| %-11s| %-10s | %-12s\n",
                    "Member " + (i + 1),
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3]);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] inputData = new double[NUM_MEMBERS][2];

        System.out.println("Enter height (cm) and weight (kg) for 10 team members:");
        for (int i = 0; i < NUM_MEMBERS; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            inputData[i][0] = scanner.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            inputData[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = computeAllBmi(inputData);
        displayResults(bmiResults);

        scanner.close();
    }
}
