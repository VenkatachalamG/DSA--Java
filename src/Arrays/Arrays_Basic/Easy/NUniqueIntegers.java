// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

package Arrays.Arrays_Basic.Easy;

import java.util.Arrays;

public class NUniqueIntegers {
    public static void main(String[] args) {
        int n = 6;
        int[] ans = nUniqueIntegers(n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nUniqueIntegers(int n) {
        int[] result = new int[n];
        int index = 0;

        // Generate pairs of positive and negative numbers
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If n is odd, include 0 in the result
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }
}
