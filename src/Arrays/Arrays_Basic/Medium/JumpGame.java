// https://leetcode.com/problems/jump-game/

package Arrays.Arrays_Basic.Medium;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        boolean ans = jumpToEnd(arr);
        System.out.println(ans);
    }

    private static boolean jumpToEnd(int[] arr) {
        int maximumJump = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > maximumJump)
                return false;
            maximumJump = Math.max(maximumJump, i + arr[i]);
        }
        return true;
    }
}
