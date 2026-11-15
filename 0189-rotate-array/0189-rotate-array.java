import java.util.Arrays;

class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;                         // Handle cases where k is greater than array length

        reverse(nums, 0, n - 1);          // Reverse the entire array

        reverse(nums, 0, k - 1);          //Reverse the first k elements

        reverse(nums, k, n - 1);          // Reverse the remaining elements
    }

    public void reverse(int[] nums, int start, int end) {      // reverse a portion of the array

        while (start < end) {

            int temp = nums[start];                     // Swap the elements

            nums[start] = nums[end];

            nums[end] = temp;

            start++;                             // Move towards the middle
            end--;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));

        obj.rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
