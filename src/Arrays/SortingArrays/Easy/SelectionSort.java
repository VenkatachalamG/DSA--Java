package Arrays.SortingArrays.Easy;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxElementIndex = findMax(arr, 0, lastIndex);

            //swap max with last;
            int temp = arr[maxElementIndex];
            arr[maxElementIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
        return arr;
    }

    private static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i < end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }
}
