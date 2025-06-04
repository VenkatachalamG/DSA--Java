// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/

package Strings.Easy;

public class DecryptAlpha {
    public static void main(String[] args) {
        String str = "1326#";
        String ans = decryptAlpha(str);
        System.out.println(ans);
    }

    private static String decryptAlpha(String str) {
        StringBuilder ans = new StringBuilder();
        int i =0;
        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i + 2) == '#') {
                int num = Integer.parseInt(str.substring(i, i + 2));
                ans.append((char)('a' + num - 1));
                i += 3;
            }
            else {
                int num = Integer.parseInt(str.charAt(i)+"");
                ans.append((char)('a' + num - 1));
                i++;
            }
        }
        return ans.toString();
    }
}
