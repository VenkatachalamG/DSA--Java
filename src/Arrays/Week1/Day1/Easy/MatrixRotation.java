package Arrays.Week1.Day1.Easy;

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0},
                {0, 1}
        };

        int[][] target = {
                {0, 1},
                {1, 0}
        };

        boolean ans = matrixRotation(mat, target);
        System.out.println(ans);
    }

    private static boolean matrixRotation(int[][] mat, int[][] target) {
        for (int i = 1; i <= 4; i++) {
            if(Arrays.deepEquals(matrix90Rotation(mat), target)) {
                return true;
            }
            mat = matrix90Rotation(mat);
        }
        return false;
    }

    private static int[][] matrix90Rotation(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = temp;
            }
        }
        return mat;
    }
}
