package Arrays.SearchingArrays.Medium;

import java.util.Arrays;

public class PeakElementII {
    public static void main(String[] args) {
        int[][] arr = {{10,20,15},
                {21,30,14},
                {7,16,32}
        };

        int[] ans = peakEleII(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] peakEleII(int[][] arr) {
        int start = 0, end = arr[0].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int rowIndex = findMax(arr, mid);
            boolean leftPeak = mid == 0 || arr[rowIndex][mid] > arr[rowIndex][mid - 1];
            boolean rightPeak = mid == arr[0].length - 1 || arr[rowIndex][mid] > arr[rowIndex][mid + 1];

            if (leftPeak & rightPeak) {
                return new int[] {rowIndex, mid};
            }
            else if (mid > 0 && arr[rowIndex][mid] < arr[rowIndex][mid - 1]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    private static int findMax(int[][] arr, int mid) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][mid] > arr[maxIndex][mid]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
