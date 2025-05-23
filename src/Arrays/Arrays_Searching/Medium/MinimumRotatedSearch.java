// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

package Arrays.Arrays_Searching.Medium;

public class MinimumRotatedSearch {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int ans = minimumRotatedSearch(arr);
        System.out.println(ans);
    }

    private static int minimumRotatedSearch(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            //if mid is lesser than end , go to left half
            if (arr[mid] <= arr[end]) {
                end = mid;
            }

            //else check the right half
            else {
                start = mid + 1; // Move start to the right half
            }
        }
        return arr[start];
    }

}
