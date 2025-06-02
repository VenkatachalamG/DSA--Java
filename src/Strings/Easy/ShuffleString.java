// https://leetcode.com/problems/shuffle-string/description/

package Strings.Easy;

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = shuffleString(str, indices);
        System.out.println(ans);
    }

    private static String shuffleString(String str, int[] indices) {
        char[] ans = new char[str.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[indices[i]] = str.charAt(i);
        }
        return new String(ans);
    }
}
