// https://leetcode.com/problems/valid-palindrome/description/

package Strings.Easy;

public class IsPalindromeI {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = isPalindromePhrase(str);
        System.out.println(ans);
    }

    private static boolean isPalindromePhrase(String str) {
        str = str.toLowerCase();
        if (str.length() < 2) return true;
        int i = 0, j = str.length() - 1;
        while (i < j) {

            while ( i < j && !Character.isLetterOrDigit(str.charAt(i))) i++;
            while ( i < j && !Character.isLetterOrDigit(str.charAt(j))) j--;

            if (str.charAt(i) != str.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
}
