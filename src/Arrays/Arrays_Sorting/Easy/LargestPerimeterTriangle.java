// https://leetcode.com/problems/largest-perimeter-triangle/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int ans = largestPerimeterTriangle(arr);
        System.out.println(ans);
    }

    private static int largestPerimeterTriangle(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 2; i--) {
            if(arr[i] < arr[i - 1] + arr[i - 2])
                return arr[i] + arr[i - 1] + arr[i - 2];
        }
        return 0;
    }
}
