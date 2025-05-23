// https://leetcode.com/problems/maximum-subarray/

package Arrays.Arrays_Basic.Medium;

public class LargestSubarray {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int ans = largestSubArray(arr);
        System.out.println(ans);
    }

    private static int largestSubArray(int[] arr) {
        //Brute-Force approach
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                max = Math.max(sumArray(arr, i, j),max);
//            }
//        }
        int maxSoFar = arr[0], currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    private static int sumArray(int[] arr, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return sum;
    }
}
