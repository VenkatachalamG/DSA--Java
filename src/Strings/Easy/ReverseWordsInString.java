// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

package Strings.Easy;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String word = "Let's take LeetCode contest";
        String ans = wordReversed(word);
        System.out.println(ans);
    }

    private static String wordReversed(String word) {
        // string array join approach
        String[] words = word.split(" ");
        String[] ans = new String[words.length];
        int k = 0;
        for(String w : words) {
            String reversedWord = new StringBuilder(w).reverse().toString();
            ans[k++] = reversedWord;
        }
        return String.join(" ", ans);

        //alternate approach

//        char[] ws = word.toCharArray();
//        int start = 0;
//        for (int i = 0; i < ws.length ; i++) {
//            if (i == ws.length - 1 || ws[i] == ' ') {
//                reverse(ws, start, i);
//                start = i + 1;
//            }
//        }
//        return new String(ws);
    }

    static void reverse(char[] words, int start, int end) {
        while (start < end) {
            char temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
    }
}
