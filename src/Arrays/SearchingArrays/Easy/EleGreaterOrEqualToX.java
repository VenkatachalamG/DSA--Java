// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

package Arrays.SearchingArrays.Easy;

import java.util.Arrays;

public class EleGreaterOrEqualToX {
    public static void main(String[] args) {
        int[] arr = {3,5};
        int ans = eleGreaterOrEqualToX(arr);
        System.out.println(ans);
    }

    private static int eleGreaterOrEqualToX(int[] arr) {
        //O(n^2) approach
//        int n = arr.length;
//        for (int x = 1; x <= n; x++) {
//            int count = 0;
//            for(int num : arr) {
//                if (num >= x)
//                    count++;
//            }
//            if (count == x)
//                return count;
//        }

        //O(n log(n)) approach
        Arrays.sort(arr);
        int n = arr.length;
        for (int x = 1; x <= n; x++) {
            int index = binarySearchIndx(arr, x);
            int count = n - index;
            if (count == x)
                return x;
        }
        return -1;
    }

    private static int binarySearchIndx(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int result = arr.length;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x) {
                result = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }
}
