// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package Arrays.Week1.SearchingArrays.Medium;

import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,5,5};
        int target = 6;
        int[] ans = firstAndLastPos(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] firstAndLastPos(int[] arr, int target) {
        int left = binarySearch(arr, true, target);
        int right = binarySearch(arr, false, target);
        return new int[]{left, right};
    }

    static int binarySearch(int[] arr, boolean firStOccurrence, int target) {
        int start = 0, end = arr.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (!firStOccurrence) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid  -1;
            }
        }
        return ans;
    }
}
