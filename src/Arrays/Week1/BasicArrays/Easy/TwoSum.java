// https://leetcode.com/problems/two-sum/

package Arrays.Week1.BasicArrays.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,5,12,13};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> complementMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int halfSum = target - arr[i];
            if(complementMap.containsKey(halfSum))
                return new int[]{complementMap.get(halfSum), i};
            complementMap.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
