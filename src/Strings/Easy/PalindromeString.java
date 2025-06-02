package Strings.Easy;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String str) {
        if (str.length() < 2) return true;
        int i = 0, j = str.length() - 1;
        while ( i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
