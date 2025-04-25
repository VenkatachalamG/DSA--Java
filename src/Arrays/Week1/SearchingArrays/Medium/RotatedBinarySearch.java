package Arrays.Week1.SearchingArrays.Medium;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 7;
        int ans = rotatedBinarySearch(arr, target);
        System.out.println(ans);
    }

    private static int rotatedBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (arr[start] <= arr[mid]) {
                //left half is sorted, check in it
                if (target > arr[0] && target <= arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid] && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
