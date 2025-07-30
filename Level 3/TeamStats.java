import java.util.*;

public class TeamStats {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.println("Heights of Players: " + Arrays.toString(heights));
        System.out.println("Sum of heights: " + findSum(heights));
        System.out.println("Mean height: " + findMean(heights));
        System.out.println("Shortest height: " + findMin(heights));
        System.out.println("Tallest height: " + findMax(heights));
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double findMean(int[] arr) {
        return findSum(arr) / (double) arr.length;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }
}
