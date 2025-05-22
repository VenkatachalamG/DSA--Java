package Arrays.SortingArrays.Easy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] bubbleSort(int[] arr) {
        boolean isSwap;
        for (int i = 0; i < arr.length; i++) {
            isSwap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    isSwap = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(!isSwap)
                break;
        }
        return arr;
    }
}
