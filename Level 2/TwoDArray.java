import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\n--- Person " + (i + 1) + " ---");

            double weight;
            do {
                System.out.print("Enter weight in kg: ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (height <= 0);

            double bmi = weight / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Person\tWeight(kg)\tHeight(m)\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + "\t" +
                    personData[i][0] + "\t\t" +
                    personData[i][1] + "\t\t" +
                    String.format("%.2f", personData[i][2]) + "\t" +
                    weightStatus[i]);
        }

        sc.close();
    }
}
