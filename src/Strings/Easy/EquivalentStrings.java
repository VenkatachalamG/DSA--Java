// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

package Strings.Easy;

public class EquivalentStrings {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = String.join("", word1);
        String w2 = String.join("", word2);
        return w1.equals(w2);
    }
}
