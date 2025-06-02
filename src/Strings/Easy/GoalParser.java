// https://leetcode.com/problems/goal-parser-interpretation/description/

package Strings.Easy;

public class GoalParser {
    public static void main(String[] args) {
        String str = "G()(al)";
        String ans = goalParse(str);
        System.out.println(ans);
    }

    private static String goalParse(String str) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == 'G') {
                ans.append("G");
                i++;
            }
            else if (c == '(') {
                if (str.charAt(i + 1) == ')') {
                    ans.append("o");
                    i += 2;
                }
                else {
                    ans.append("al");
                    i += 4;
                }
            }
        }
        return ans.toString();
    }
}
