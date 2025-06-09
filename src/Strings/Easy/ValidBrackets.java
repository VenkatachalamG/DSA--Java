// https://leetcode.com/problems/valid-parentheses/description/

package Strings.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        String str = "[{())]}";
        boolean ans = validBrackets(str);
        System.out.println(ans);
    }

    private static boolean validBrackets(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                stack.push(c);
            }
            else {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
