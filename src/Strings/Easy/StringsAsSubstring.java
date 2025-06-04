// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

package Strings.Easy;

public class StringsAsSubstring {
    public static void main(String[] args) {
        String word = "aaaaabbbbb";
        String[] patterns = {"a","b","c"};
        int ans = stringsAsSubStrings(word, patterns);
        System.out.println(ans);
    }

    private static int stringsAsSubStrings(String word, String[] patterns) {
        int count = 0;
        for(String w : patterns) {
            if (word.contains(w)) {
                count++;
            }
        }
        return count;
    }
}
