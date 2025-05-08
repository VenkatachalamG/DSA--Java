// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

package Arrays.Week1.BasicArrays.Easy;

public class OddCellsMatrix {
    public static void main(String[] args) {
        int[][] indices = {
                {0, 1},
                {1,1}
        };
        int m = 2, n = 3;
        int ans = oddCellsMatrix(indices, m, n);
        System.out.println(ans);
    }

    private static int oddCellsMatrix(int[][] indices, int r, int c) {
        int[][] arr = new int[r][c];
        int count = 0;
        for(int[] row : indices) {
            incrementValues(arr,r, c, row[0], row[1]);
        }
        for(int[] row : arr) {
            for(int val : row) {
                if (val % 2 != 0)
                    count++;
            }
        }
        return count;
    }

    private static void incrementValues(int[][] arr, int r, int c, int rval, int cval) {
        for (int i = 0; i < c; i++) {
            arr[rval][i]++;
        }
        for (int j = 0; j < r; j++) {
            arr[j][cval]++;
        }
    }
}
