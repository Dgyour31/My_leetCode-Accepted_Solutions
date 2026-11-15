class Solution {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();                         //coverting string to lowercase

        s = s.replaceAll("[^a-z0-9]", "");           //Remove all non-alphanumeric characters

        String reversed = new StringBuilder(s).reverse().toString();          // Reverse the cleaned string
 
        return s.equals(reversed);                     //Compare original and reversed strings
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(s);

        System.out.println("Input: " + s);
        System.out.println("Is Palindrome: " + result);
    }
}
