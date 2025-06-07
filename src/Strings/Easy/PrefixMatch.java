// https://leetcode.com/problems/longest-common-prefix/description/

package Strings.Easy;

public class PrefixMatch {
    public static void main(String[] args) {
        String[] str = {};
        String ans = prefixMatch(str);
        System.out.println(ans);
    }

    private static String prefixMatch(String[] str) {
        if (str.length < 2) {
            return str.length == 0 ? "" : str[0];
        }
        String prev = str[0];
        for (int i = 1; i < str.length; i++) {
            String ans = prefixFind(prev, str[i]);
            if (ans.isEmpty()) return "";
            prev = ans;
        }
        return prev;
    }

    private static String prefixFind(String prev, String current) {
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (i < prev.length() && j < current.length()) {
            if(prev.charAt(i) == current.charAt(j)) {
                ans.append(prev.charAt(i));
                i++;
                j++;
            }
            else {
                return ans.toString();
            }
        }
        return ans.toString();
    }
}
