import java.util.Arrays;

class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int i = n - 2;             //finding pivot emement

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {        //Find the next greater element

            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[i];              //Swaping the elements
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int start = i + 1;               //Reversing the remaining elements
        int end = n - 1;

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 3, 5, 4, 2};

        System.out.println("Original Array: " + Arrays.toString(nums));

        obj.nextPermutation(nums);

        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}
