// https://leetcode.com/problems/height-checker/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        int ans = heightChecker(arr);
        System.out.println(ans);
    }

    private static int heightChecker(int[] arr) {
        if (arr.length == 1)
            return 1;
        int count = 0;
        int[] ans = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ans[i])
                count++;
        }
        return count;
    }
}
