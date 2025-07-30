import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        return year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close(); // fix for resource leak
    }
}
