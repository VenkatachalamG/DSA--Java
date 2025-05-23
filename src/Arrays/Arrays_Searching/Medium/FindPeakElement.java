// https://leetcode.com/problems/find-peak-element/

package Arrays.Arrays_Searching.Medium;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }

    private static int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                //ascending part of the array, peak could lie to the right
                start = mid + 1; // so move right
            }
            else {
                //peak could lie on the left hand side including mid
                end = mid; // so move left starting from mid
            }
        }
        //return start as peak index is at start
        return start;
    }
}
