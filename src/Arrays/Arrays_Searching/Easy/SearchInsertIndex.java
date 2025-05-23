// https://leetcode.com/problems/search-insert-position/

package Arrays.Arrays_Searching.Easy;

public class SearchInsertIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,7,8};
        int target = 10;
        int ans = searchInsertIndex(arr, target);
        System.out.println(ans);
    }

    private static int searchInsertIndex(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid  -1;
            else
                start = mid + 1;
        }
        return start;
    }
}
