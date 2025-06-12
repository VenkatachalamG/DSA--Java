package Arrays.Arrays_Basic.Medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2,3,6,5,4,1};
        int[] ans = nextPermutation(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextPermutation(int[] arr) {
        int n = arr.length, i = n - 2;
        while ( i > 0 && arr[i] > arr[i + 1]) {
            i--;
        }
        if ( i >= 0) {
            int j  = n - 1;
            while (arr[j] < arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        else {
            reverse(arr, 0, n - 1);
            return arr;
        }
        reverse (arr, i + 1, n - 1);
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
