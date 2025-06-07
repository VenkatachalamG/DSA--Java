// https://leetcode.com/problems/long-pressed-name/description/

package Strings.Easy;

public class LongPressedChar {
    public static void main(String[] args) {
        String name = "alex", pressed = "aaleexa";
        boolean ans = longPressedChar(name, pressed);
        System.out.println(ans);
    }

    private static boolean longPressedChar(String name, String pressed) {
        int i = 0, j = 0;

        while ( i < name.length() && j < pressed.length()) {
            if (name.charAt(i) == pressed.charAt(j)) {
                i++;
                j++;
            }
            else if (j > 0 && pressed.charAt(j) == pressed.charAt(j - 1)){
                j++;
            }
            else {
                return false;
            }
        }

        if ( j < pressed.length()) {
            while ( j < pressed.length() && pressed.charAt(j) == pressed.charAt(j - 1)) {
                j++;
            }
        }

        return i == name.length() && j == pressed.length();

    }
}
