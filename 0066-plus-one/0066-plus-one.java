class Solution {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {                // Start from the last digit

            if (digits[i] < 9) {                     
                digits[i]++;
                return digits;
            }

            digits[i] = 0;             //// If the digit is 9, make it 0
        }

        int[] result = new int[digits.length + 1];                 // If all digits are 9, create a new array

        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] digits = {1, 2, 3};

        int[] result = obj.plusOne(digits);

        System.out.print("Result: ");

        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
