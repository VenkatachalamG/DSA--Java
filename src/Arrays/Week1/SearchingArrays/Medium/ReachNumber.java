// https://leetcode.com/problems/reach-a-number/

package Arrays.Week1.SearchingArrays.Medium;

public class ReachNumber {
    public static void main(String[] args) {
        int target = 7;
        int ans = reachNumber(target);
        System.out.println(ans);
    }

    private static int reachNumber(int target) {
        if (target < 0) target *= -1;
        int sum = 0, stepCount = 1;

        while (sum < target || (sum - target) % 2 != 0) {
            /*until you haven't either reached the target or you have reached it but cannot adjust your steps to at least reach target
             continue to dd sum and steps
            */
            sum += stepCount;
            stepCount++;
        }
        return stepCount - 1;
    }
}
