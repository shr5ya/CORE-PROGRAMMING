import java.util.Scanner;

public class StudentGradesTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // [student][subject]
        int[][] marks = new int[n][3]; // 0 - Physics, 1 - Chemistry, 2 - Maths

        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks in " + subject + ": ");
                int mark = sc.nextInt();

                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter this student's data.");
                    i--;
                    break;
                }
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.println("\n--- Student Results ---");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t\t" +
                    marks[i][0] + "\t\t" +
                    marks[i][1] + "\t\t\t" +
                    marks[i][2] + "\t\t" +
                    String.format("%.2f", percentages[i]) + "%\t\t" +
                    grades[i]);
        }
    }
}
