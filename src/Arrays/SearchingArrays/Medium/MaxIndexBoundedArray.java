// https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/

package Arrays.SearchingArrays.Medium;

public class MaxIndexBoundedArray {
    public static void main(String[] args) {
        int n = 4,index = 2, maxSum = 6;
        int ans = maxIndexBoundedArray(n, index, maxSum);
        System.out.println(ans);
    }

    private static int maxIndexBoundedArray(int n, int index, int maxSum) {
        int start = 1, end = maxSum, value = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long answer = getValue(mid, n, index);
            if (answer <= maxSum) {
                value = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return value;
    }

    static long getValue (int mid, int n, int index) {
        long decreasingAp = getSides(mid - 1, index);
        long nonDecAP = getSides(mid - 1, n - index - 1);

        return decreasingAp + nonDecAP + mid;
    }

    private static long getSides(int val1, int val2) {
        if (val1 <= val2) {
            //it is an AP
            return (long)(val1 + 1) * val1 / 2 + (val2 - val1);
        }
        else {
            return (long)(val1 + (val2 - val1 + 1)) * val2 / 2;
        }
    }
}
