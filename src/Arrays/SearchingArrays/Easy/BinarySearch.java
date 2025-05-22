// https://leetcode.com/problems/binary-search/

package Arrays.SearchingArrays.Easy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,10,12};
        int target = 6;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
