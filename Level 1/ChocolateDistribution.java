import java.util.Scanner;
public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter chocolates and children: ");
            int chocolates = sc.nextInt();
            int children = sc.nextInt();
            int[] res = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets: " + res[0] + ", Remaining chocolates: " + res[1]);
        }
    }
}