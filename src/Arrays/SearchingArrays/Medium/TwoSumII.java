// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

package Arrays.SearchingArrays.Medium;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSumII(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSumII(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            }
            else if (sum > target) {
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
