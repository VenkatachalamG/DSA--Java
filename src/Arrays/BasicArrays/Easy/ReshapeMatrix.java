// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package Arrays.BasicArrays.Easy;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2, 3},
                {4,5,6}};
        int r = 3, c = 4;
        int[][] ans = reshapeMatrix(mat, r, c);
        for(int[] row : ans)
            System.out.println(Arrays.toString(row));
    }

    private static int[][] reshapeMatrix(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c)
            return mat;
        int[][] ans = new int[r][c];
        for (int i = 0; i < mat.length * mat[0].length; i++) {
            ans[i / c][i % c] = mat[i / mat[0].length][i % mat[0].length];
        }
        return ans;
    }
}
