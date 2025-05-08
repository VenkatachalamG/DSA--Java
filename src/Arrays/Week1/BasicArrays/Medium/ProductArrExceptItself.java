// https://leetcode.com/problems/product-of-array-except-self/

package Arrays.Week1.BasicArrays.Medium;

import java.util.Arrays;

public class ProductArrExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf(arr);
        System.out.println((Arrays.toString(ans)));
    }

    private static int[] productExceptSelf(int[] arr) {
        int i = 1, j = arr.length - 2;
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        //initialise prefix and suffix arrays
        prefix[0] = arr[0];
        suffix[arr.length - 1] = arr[arr.length - 1];
        //precompute prefix and suffix arrays
        while (i < arr.length && j >= 0) {
            prefix[i] = prefix[i - 1] * arr[i];
            suffix[j] = suffix[j + 1] * arr[j];
            i++;
            j--;
        }
        //in-place updating of arr
        for (int k = 0; k < arr.length; k++) {
            int prefixSum = (k == 0) ? 1 : prefix[k - 1];
            int suffixSum = (k == arr.length - 1) ? 1 : suffix[k + 1];
            arr[k] = prefixSum * suffixSum;
        }
        return arr;
    }
}
