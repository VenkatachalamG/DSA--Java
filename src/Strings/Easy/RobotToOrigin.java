// https://leetcode.com/problems/robot-return-to-origin/

package Strings.Easy;

public class RobotToOrigin {
    public static void main(String[] args) {
        String moves = "LL";
        boolean ans = robotToOrigin(moves);
        System.out.println(ans);
    }

    private static boolean robotToOrigin(String moves) {
        int left = 0, right = 0, up = 0, down = 0;
        for(char move : moves.toCharArray()) {
            if (move == 'U')
                up++;
            else if (move == 'D')
                down++;
            else if (move == 'L')
                left++;
            else
                right++;
        }
        return up == down && left == right;
    }
}
