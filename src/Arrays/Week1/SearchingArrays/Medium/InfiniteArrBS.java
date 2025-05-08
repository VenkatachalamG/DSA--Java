// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

package Arrays.Week1.SearchingArrays.Medium;

public class InfiniteArrBS {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,10,15,23,27,30};
        int target = 27;
        boolean ans = infiniteArrBS(arr, target);
        System.out.println(ans);
    }

    private static boolean infiniteArrBS(int[] arr, int target) {
        int start = 0, end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, start, end, target);
    }

    static boolean binarySearch(int[] arr, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end - start)  /2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
