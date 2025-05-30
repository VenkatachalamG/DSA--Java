// https://leetcode.com/problems/largest-number/description/

package Arrays.Arrays_Sorting.Medium;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {3,34,30,5,9};
        String ans = largestNumber(arr);
        System.out.println(ans);
    }

    private static String largestNumber(int[] arr) {
        StringBuilder ans = new StringBuilder();
        String[] array = new String[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i] + "";
        }
        Arrays.sort(array, (a,b) -> (b+a).compareTo(a + b));

        for (String s : array) {
            ans.append(s);
        }
        return ans.toString();
    }
}
