// https://leetcode.com/problems/peak-index-in-a-mountain-array/

package Arrays.Week1.SearchingArrays.Medium;

public class PeakMountainIndex {
    public static void main(String[] args) {
        int[] arr = {0,4,0};
        int ans = peakMountainIndex(arr);
        System.out.println(ans);
    }

    private static int peakMountainIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) /2;
            if (arr[mid] < arr[mid + 1]) //ascending part of array move right
                start = mid + 1;
            else // descending part with potential answer so move left
                end = mid; //not end = mid - 1
        }
        return start;
    }
}
