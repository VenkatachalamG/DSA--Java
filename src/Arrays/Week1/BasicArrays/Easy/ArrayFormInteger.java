// https://leetcode.com/problems/add-to-array-form-of-integer/description/

package Arrays.Week1.BasicArrays.Easy;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        int[] ans = arrayFormOfInteger(num, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] arrayFormOfInteger(int[] num, int k) {
        int i = num.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
       while (i >= 0 || k > 0) {
           if (i >= 0) {
               k += num[i];
           }
           list.add(k % 10);
           k /= 10;
           i--;
       }
        return list.reversed().stream().mapToInt(Integer::intValue).toArray();
    }
}
