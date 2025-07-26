import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(original + " is a Harshad number? " + (original % sum == 0));
        sc.close();
    }
}
