// https://leetcode.com/problems/spiral-matrix-ii/

package Arrays.Arrays_Basic.Medium;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = spiralMatrixII(n);
        for(int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] spiralMatrixII(int n) {
        int[][] ans = new int[n][n];
        int m = ans.length, l = ans[0].length;
        int top = 0, left = 0, bottom = m - 1, right = l - 1;
        int num = 1;
        while (top <= bottom && left <= right) {
            //go right
            for (int i = left; i <= right; i++) {
                ans[top][i] = num;
                num++;
            }
            top++;

            //go down
            if(top <= bottom) {
                for (int i = top; i <= bottom ; i++) {
                    ans[i][right] = num;
                    num++;
                }
                right--;
            }

            //go left
            if (top <= bottom) {
                for (int i = right; i >= left ; i--) {
                    ans[bottom][i] = num;
                    num++;
                }
                bottom--;
            }

            //go up
            if (left <= right) {
                for (int i = bottom; i >= top ; i--) {
                    ans[i][left] = num;
                    num++;
                }
                left++;
            }
        }
        return ans;
    }
}
