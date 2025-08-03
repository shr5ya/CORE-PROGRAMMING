import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class StudentScorecard {

    public static int[][] generatePcmScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10;
            scores[i][1] = random.nextInt(90) + 10;
            scores[i][2] = random.nextInt(90) + 10;
        }
        return scores;
    }

    public static double[][] calculatePerformance(int[][] pcmScores) {
        int numStudents = pcmScores.length;
        double[][] performance = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int physics = pcmScores[i][0];
            int chemistry = pcmScores[i][1];
            int math = pcmScores[i][2];

            double total = physics + chemistry + math;
            double percentage = (total / 300.0) * 100.0;
            double average = total / 3.0;

            performance[i][0] = Math.round(total * 100.0) / 100.0;
            performance[i][1] = Math.round(average * 100.0) / 100.0;
            performance[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return performance;
    }

    public static String[][] assignGrades(double[][] performanceData) {
        int numStudents = performanceData.length;
        String[][] grades = new String[numStudents][1];

        for (int i = 0; i < numStudents; i++) {
            double percentage = performanceData[i][2];
            String grade;

            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else if (percentage >= 40) {
                grade = "E";
            } else {
                grade = "R";
            }
            grades[i][0] = grade;
        }
        return grades;
    }

    public static void displayScorecard(int[][] pcmScores, double[][] performanceData, String[][] grades) {
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s | %-7s | %-9s | %-6s | %-6s | %-8s | %-10s | %-5s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------------------------------");

        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < pcmScores.length; i++) {
            System.out.printf("%-10s | %-7d | %-9d | %-6d | %-6s | %-8s | %-10s | %-5s\n",
                    "Student " + (i + 1),
                    pcmScores[i][0],
                    pcmScores[i][1],
                    pcmScores[i][2],
                    df.format(performanceData[i][0]),
                    df.format(performanceData[i][1]),
                    df.format(performanceData[i][2]),
                    grades[i][0]);
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] pcmScores = generatePcmScores(numStudents);

        double[][] performanceData = calculatePerformance(pcmScores);

        String[][] studentGrades = assignGrades(performanceData);

        displayScorecard(pcmScores, performanceData, studentGrades);

        scanner.close();
    }
}