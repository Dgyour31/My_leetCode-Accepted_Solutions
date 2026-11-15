import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);       //sorting intervals based on their startoing value

        List<int[]> result = new ArrayList<>();            // creating list and merging intervals

        for (int[] interval : intervals) {             // Traversing through all intervals          

            if (result.isEmpty() ||
                result.get(result.size() - 1)[1] < interval[0]) {

                result.add(interval);
            }

            else {                                     // If intervals overlap, merge them

                result.get(result.size() - 1)[1] =
                    Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);          //Converting the list into a 2D array
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = obj.merge(intervals);

        System.out.println("Merged Intervals:");

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}
