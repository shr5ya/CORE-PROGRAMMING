import java.util.Scanner;


public class VotingAgeChecker {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);
            boolean canVote = ages[i] >= 18;
            eligibility[i][1] = String.valueOf(canVote);
        }
        return eligibility;
    }

    public static void displayTable(String[][] data, String[] headers) {
        if (data.length == 0 || headers.length == 0) {
            System.out.println("No data to display.");
            return;
        }
        int[] colWidths = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            colWidths[i] = getLength(headers[i]);
        }
        for (String[] row : data) {
            for (int j = 0; j < row.length; j++) {
                if (getLength(row[j]) > colWidths[j]) {
                    colWidths[j] = getLength(row[j]);
                }
            }
        }
        
        System.out.print("|");
        for (int i = 0; i < headers.length; i++) {
            System.out.printf(" %-" + (colWidths[i] + 1) + "s |", headers[i]);
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < headers.length; i++) {
            System.out.printf(" %-" + (colWidths[i] + 1) + "s |", "=".repeat(colWidths[i]));
        }
        System.out.println();
        
        for (String[] row : data) {
            System.out.print("|");
            for (int j = 0; j < row.length; j++) {
                System.out.printf(" %-" + (colWidths[j] + 1) + "s |", row[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program: Student Voting Age Check ---");
        System.out.print("Enter the number of students (e.g., 10): ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        int[] ages = generateAges(numStudents);
        String[][] eligibility = checkVotingEligibility(ages);

        System.out.println("\nStudent Voting Eligibility:");
        displayTable(eligibility, new String[]{"Age", "Can Vote"});

        scanner.close();
    }
}
