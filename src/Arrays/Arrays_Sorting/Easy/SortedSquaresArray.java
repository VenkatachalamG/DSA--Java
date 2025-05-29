// https://leetcode.com/problems/squares-of-a-sorted-array/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class SortedSquaresArray {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        int[] ans = sortedSquares(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        int last = n - 1;
        int[] ans = new int[n];
        while (i <= j) {
            int left = arr[i] * arr[i];
            int right = arr[j] * arr[j];
            /*
                if left square greater than right square add it to last; move i forward as there still could be
                some right values which are greater than left.
             */
            if (left > right) {
                ans[last--] = left;
                i++;
            }
            /*
                else add right square to the last and decrement j as there could be some left values which are greater
                than right.
             */
            else {
                ans[last--] = right;
                j--;
            }
        }
        return ans;
    }
}
