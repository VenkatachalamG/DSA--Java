package Arrays.Week1.Day1.Easy;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1};
        int[] ans = arrayConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] arrayConcatenation(int[] arr) {
        int[] ans = new int[2 * arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[i % arr.length];
        }
        return ans;
    }
}
