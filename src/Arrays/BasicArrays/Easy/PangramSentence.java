// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

package Arrays.BasicArrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class PangramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = isPangram(sentence);
        System.out.println(ans);
    }

    private static boolean isPangram(String sentence) {
       Set<Character> alphaSet = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.toLowerCase().charAt(i);
            if (c >= 'a' && c <= 'z')
                alphaSet.add(c);
        }
        return alphaSet.size() == 26;
    }
}
