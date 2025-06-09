// https://leetcode.com/problems/reverse-prefix-of-word/description/

package Strings.Easy;

public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdebd";
        char ch = 'd';
        String ans = reversePrefix(word, ch);
        System.out.println(ans);
    }

    private static String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int index = word.indexOf(ch);
        if (index != -1) {

            String initialWord = reverse(word, 0, index);
            ans.append(initialWord);
            ans.append(word, index + 1, word.length());
            return ans.toString();
        }
        else {
            return word;
        }
    }

    static String reverse(String word, int start, int end) {
        StringBuilder ans = new StringBuilder();
        for (int i = end; i >= start ; i--) {
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}
