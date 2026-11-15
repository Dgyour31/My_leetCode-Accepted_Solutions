import java.util.*;

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {             // Traverse from left to right
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {          // Traverse from top to bottom
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {                           // Traverse from right to lef
                for (int i = right; i >= left; i--) {  
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {                              //Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = obj.spiralOrder(matrix);

        System.out.println("Spiral Order: " + result);
    }
}
