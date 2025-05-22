// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

package Arrays.SearchingArrays.Medium;

public class RotatedBinarySearchII {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = rotatedBinarySearchII(arr, target);
        System.out.println(ans);
    }

    private static boolean rotatedBinarySearchII(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return true;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            else {
                if (arr[start] <= arr[mid]) {
                    //left half is sorted, check in it
                    if (target >= arr[start] && target <= arr[mid])
                        end = mid - 1;
                    else
                        start = mid + 1;
                }
                else {
                    //right half is sorted, check in it
                    if (target >= arr[mid] && target <= arr[end])
                        start = mid + 1;
                    else
                        end = mid - 1;
                }
            }
        }
        return false;
    }
}
