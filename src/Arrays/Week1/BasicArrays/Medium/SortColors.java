package Arrays.Week1.BasicArrays.Medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int[] ans = sortColors(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortColors(int[] arr) {
        //Dutch National Flag method
        int i = 0, j = 0, k = arr.length - 1;
        while (j <= k) {
            if (arr[j] == 1)
                j++;
            else if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            }
            else {
                swap(arr, j, k);
                k--;
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
