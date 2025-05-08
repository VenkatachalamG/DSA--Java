// https://leetcode.com/problems/shuffle-the-array/

package Arrays.Week1.BasicArrays.Easy;

import java.util.Arrays;

public class ShuffledArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffledArray(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] shuffledArray(int[] arr, int n) {
//        uses three pointers
//        int i = 0, j = n, k = 0;
//        int[] ans = new int[2 * n];
//        while (i < n && j < 2 * n) {
//            ans[k++] = arr[i];
//            ans[k++] = arr[j];
//            i++;
//            j++;
//        }
//        return ans;

//        single pointer, single for loop
        int[] ans = new int[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = arr[i];
            ans[j++] = arr[i + n];
        }
        return ans;
    }
}
