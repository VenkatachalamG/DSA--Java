// https://leetcode.com/problems/find-right-interval/

package Arrays.SearchingArrays.Medium;

import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args) {
        int[][] arr = {{3,4}, {2,3}, {1,2}};
        int[] ans = rightInterval(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rightInterval(int[][] arr) {
        int[][] indexedStarts = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            indexedStarts[i][0] = arr[i][0]; // start value
            indexedStarts[i][1] = i;         // original index
        }

// 2. Sort by start value
        Arrays.sort(indexedStarts, (a, b) -> Integer.compare(a[0], b[0]));

// 3. Result array
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int targetEnd = arr[i][1];
            int low = 0, high = arr.length - 1;
            int resultIndex = -1;

            // Binary search for smallest start >= targetEnd
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (indexedStarts[mid][0] >= targetEnd) {
                    resultIndex = indexedStarts[mid][1]; // store original index
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            ans[i] = resultIndex;
        }
        return ans;
    }
}
