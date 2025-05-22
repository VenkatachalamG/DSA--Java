package Arrays.BasicArrays.Easy;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,45,67,12,230,14,78,43};
        int[] ans = reverseArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while ( i<= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
