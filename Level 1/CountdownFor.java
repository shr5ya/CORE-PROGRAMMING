import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to countdown from: ");
        int n = sc.nextInt();

        System.out.println("Countdown using for loop:");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
