// https://leetcode.com/problems/sort-array-by-parity/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] arr = {2,7,9,6,8};
        int[] ans = sortByParity(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortByParity(int[] arr) {
        if (arr.length < 2)
            return arr;
        int i = 0, j = arr.length - 1;
        while ( i < j) {
            //both nums are even
            if ((arr[i] & 1) == 0 && (arr[j] & 1) == 0) {
                i++;
            }
            //both are odd
            else if ((arr[i] & 1) == 1 && (arr[j] & 1) == 1) {
                j--;
            }
            //arr[i] is odd and arr[j] is even
            else if ((arr[i] & 1) == 1 && (arr[j] & 1) == 0) {
                swap(arr, i, j);
            }
            else {
                i++;
                j--;
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
