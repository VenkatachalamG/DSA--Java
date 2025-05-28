// https://leetcode.com/problems/sort-array-by-parity-ii/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class SortByParityII {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        int[] ans = sortByParityII(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortByParityII(int[] arr) {
        int i = 0, j = 1;
        int n = arr.length;
        while (i < n && j < n) {
            if ((arr[i] & 1) == 0) {
                i += 2;
            }
            else if ((arr[j] & 1) == 1) {
                j += 2;
            }
            else {
                swap(arr, i, j);
                i += 2;
                j += 2;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
