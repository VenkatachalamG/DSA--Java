// https://leetcode.com/problems/maximum-product-of-three-numbers/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class MaximumThreeProduct {
    public static void main(String[] args) {
        int[] arr = {-50,4,3};
        int ans = maxThreeProd(arr);
        System.out.println(ans);
    }

    private static int maxThreeProd(int[] nums) {
        int n = nums.length;
        if (nums.length == 3)
            return nums[0] * nums[1] * nums[2];
        Arrays.sort(nums);
        return Math.max(nums[n- 1] * nums[n -2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }
}
