// https://leetcode.com/problems/plus-one/

package Arrays.Week1.BasicArrays.Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {1,7};
        int[] ans = plusOne(num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] plusOne(int[] num) {
        int n = num.length, carry = 0;;
        if (num[n - 1] + 1 <= 9) {
            num[n - 1] += 1;
            return num;
        }
        else {
            num[n - 1] = 0;
            carry = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (carry == 1) {
                int sum = num[i] + carry;
                if (sum == 10) {
                    num[i] = 0;
                }
                else {
                    num[i] = sum;
                    carry = 0;
                }
            }
            else
                break;
        }
        if (carry == 1) {
            int[] res = new int[n + 1];
            res[0] = 1;
            return res;
        }
        return num;
    }
}
