package Arrays.Arrays_Basic.Easy;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        int[] ans = runningSumOfArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] runningSumOfArray(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans[i] = ans[i - 1] + arr[i];
        }
        return ans;
    }
}
