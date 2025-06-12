package Arrays.Arrays_Basic.Easy;

import java.util.Arrays;

public class ZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,3,0,12};
        int[] ans = zeroesToEnd(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] zeroesToEnd(int[] arr) {
        int i = 0, j = 1;
        while ( j < arr.length) {
            if (arr[j] == 0) j++;
            if (arr[j] != 0) {
                if (arr[i] == 0) {
                    swap(arr, i, j);
                    i++;
                    j++;
                }
                else {
                    i++;
                    j = Math.max(j, i + 1);
                }
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
