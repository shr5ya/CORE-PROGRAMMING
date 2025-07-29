import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (m): ");
            heights[i] = scanner.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        
        System.out.println("\nHeight(m)  Weight(kg)  BMI       Status");
        System.out.println("------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f      %.2f       %.2f    %s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}
