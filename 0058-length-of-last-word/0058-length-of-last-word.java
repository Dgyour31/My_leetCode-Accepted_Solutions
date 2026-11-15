
class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // Skip spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        // Count the characters in the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "love Bhutan";

        System.out.println("Input: " + s);
        System.out.println("Length of last word: " + obj.lengthOfLastWord(s));
    }
}
