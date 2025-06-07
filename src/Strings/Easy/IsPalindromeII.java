// https://leetcode.com/problems/valid-palindrome-ii/description/

package Strings.Easy;

public class IsPalindromeII {
    public static void main(String[] args) {
        String s = "abc";
        boolean ans = isPalindromeII(s);
        System.out.println(ans);
    }

    private static boolean isPalindromeII(String s) {
        int i = 0, j = s.length() - 1;
        while ( i < j) {

            //mismatch occurs, check for palindrome after character removal
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        // all characters are equal return true
        return true;
    }

    static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
