// https://leetcode.com/problems/sorting-the-sentence/description/

package Strings.Easy;

public class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }

    static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] ans = new String[str.length];
        for (String word : str) {
            // alternate to find index is do parse int of char - '1' or '0' depending on array indexing
            int index = Integer.parseInt(String.valueOf(word.charAt(word.length() - 1))) - 1;
            ans[index] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", ans);
    }
}
