// https://leetcode.com/problems/merge-strings-alternately/submissions/1658513641/

package Strings.Easy;

public class AlternateMerge {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "pqr";
        String ans = alternateMerge(s1, s2);
        System.out.println(ans);
    }

    private static String alternateMerge(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int i = 0,j = 0;
        while (i < s1.length() && j < s2.length()) {
            ans.append(s1.charAt(i));
            ans.append(s2.charAt(j));
            i++;
            j++;
        }

        while ( i < s1.length()) {
            ans.append(s1.charAt(i));
            i++;
        }

        while ( j < s2.length()) {
            ans.append(s2.charAt(j));
            j++;
        }

        return ans.toString();
    }
}
