import java.util.Scanner;
public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) ||
               (month > 3 && month < 6) ||
               (month == 6 && day <= 20);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter month: ");
            int month = sc.nextInt();
            System.out.print("Enter day: ");
            int day = sc.nextInt();
            System.out.println(isSpring(month, day) ? "It's a Spring Season" : "Not a Spring Season");
        }
    }
}