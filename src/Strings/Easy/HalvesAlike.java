// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

package Strings.Easy;

public class HalvesAlike {
    public static void main(String[] args) {
        String str = "Uo";
        boolean ans = halvesAreAlike(str);
        System.out.println(ans);
    }

    private static boolean halvesAreAlike(String str) {
        String str1= str.toLowerCase();
        int firstHalf = 0, secondHalf = 0;
        int n = str1.length();
        for (int i = 0; i < n / 2; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(n / 2 + i);

            if (isVowel(ch1)) firstHalf++;
            if (isVowel(ch2)) secondHalf++;
        }
        return firstHalf == secondHalf;
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
