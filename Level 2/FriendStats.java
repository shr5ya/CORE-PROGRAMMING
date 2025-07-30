public class FriendStats {
    public static int findYoungest(int[] ages) {
        int min = ages[0], index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
                index = i;
            }
        }
        return index;
    }

    public static int findTallest(double[] heights) {
        double max = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
                index = i;
            }
        }
        return index;
    }
}