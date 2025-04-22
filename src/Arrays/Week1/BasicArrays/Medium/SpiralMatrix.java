package Arrays.Week1.BasicArrays.Medium;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},
                {3,4}};
        int[] ans = spiralMatrix(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] spiralMatrix(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int top = 0, left = 0, bottom = m - 1, right = n - 1, k = 0;
        int[] ans = new int[m * n];
        while (top <= bottom && left <= right) {
            // move right
            for(int i = left; i <= right; i++) {
                ans[k++] = arr[top][i];
            }
            top++;

            //move down
            if(top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    ans[k++] = arr[i][right];
                }
                right--;
            }

            //go left
            if(top <= bottom) {
                for (int i = right; i >= left ; i--) {
                    ans[k++] = arr[bottom][i];
                }
                bottom--;
            }

            //go right
            if (left<= right) {
                for (int i = bottom; i >= top ; i--) {
                    ans[k++] = arr[i][left];
                }
                left++;
            }
        }
        return ans;
    }
}
