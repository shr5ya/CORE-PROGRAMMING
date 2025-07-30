import java.util.*;

public class StudentScorecard {

    public static int[][] generateMarks(int count) {
        int[][] marks = new int[count][3];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + (int)(Math.random() * 90); // random 2-digit score
            }
        }
        return marks;
    }

    public static double[][] computeStats(int[][] marks) {
        double[][] stats = new double[marks.length][3]; // [total, average, percentage]
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0 * 100.0) * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }

    public static void displayScorecard(int[][] marks, double[][] stats) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", 
                          "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f%n",
                              (i + 1), marks[i][0], marks[i][1], marks[i][2],
                              stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = sc.nextInt();

        int[][] marks = generateMarks(studentCount);
        double[][] stats = computeStats(marks);
        displayScorecard(marks, stats);

        sc.close();
    }
}
