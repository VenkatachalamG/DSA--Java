// https://leetcode.com/problems/build-array-from-permutation/

package Arrays.Week1.BasicArrays.Easy;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = permutationArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] permutationArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
