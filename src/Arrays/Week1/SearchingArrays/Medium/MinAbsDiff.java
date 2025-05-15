package Arrays.Week1.SearchingArrays.Medium;

import java.util.Arrays;

public class MinAbsDiff {
    public static void main(String[] args) {
        int[] arr1 = {1,7,5}, arr2 = {2,3,5};
        double ans = maxAbsDiff(arr1, arr2);
        System.out.println(ans);
    }

    private static double maxAbsDiff(int[] nums1, int[] nums2) {
        int MOD = 1000000007;
        int n = nums1.length;
        int initialSum = 0;
        int maxReduction = 0;
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);

        for (int i = 0; i < n; i++) {
            int currentDiff = Math.abs(nums1[i] - nums2[i]);
            initialSum = (initialSum + currentDiff) % MOD;

            // Find the closest element in sortedNums1 to nums2[i] using binary search
            int closest = bestSort(sortedNums1, nums2[i]);
            int newDiff = Math.abs(closest - nums2[i]);

            int reduction = currentDiff - newDiff;
            maxReduction = Math.max(maxReduction, reduction);
        }

        return (initialSum - maxReduction + MOD) % MOD; // Add MOD to handle potential negative results
    }

    private static int bestSort(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int closest = arr[0]; // Initialize with the first element
        int minDiff = Math.abs(arr[0] - target);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int diff = Math.abs(arr[mid] - target);

            if (diff < minDiff) {
                minDiff = diff;
                closest = arr[mid];
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return arr[mid]; // Exact match found
            }
        }

        return closest;
    }
}
