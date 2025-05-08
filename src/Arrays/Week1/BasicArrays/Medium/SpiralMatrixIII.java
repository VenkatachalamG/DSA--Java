// https://leetcode.com/problems/spiral-matrix-iii/

package Arrays.Week1.BasicArrays.Medium;

import java.util.Arrays;

public class SpiralMatrixIII {
    public static void main(String[] args) {
        int row = 1, col = 4, rStart = 0, cStart = 0;
        int[][] ans = spiralMatrixIII(row, col, rStart, cStart);
        for(int[] rows : ans)
            System.out.println(Arrays.toString(rows));
    }

    private static int[][] spiralMatrixIII(int row, int col, int rStart, int cStart) {
        int total = row * col, count = 0, stepSize = 1, dir = 0;
        int[][] step = {{0,1}, {1,0},{0, -1}, {-1,0}};
        int[][] result = new int[row * col][2]; //the 2 is because we want to store a pair (r, c) in the result array
        if (rStart >= 0 && rStart < row && cStart >= 0 && cStart < col) {
            result[count++] = new int[]{rStart,cStart};
        }

        while (count < total) {
            //outer loop to traverse current direction set ,i.e, either of (right, down) or (left, up)
            for (int i = 0; i < 2; i++) {
                // inner loop to travel the expanding spiral 'stepSize' number of times
                for (int j = 0; j < stepSize; j++) {
                    //increment row and col by one every time to travel incrementally
                    rStart += step[dir][0];
                    cStart += step[dir][1];
                    // check if (rStart,cStart) is valid
                    if (rStart >= 0 && rStart < row && cStart >= 0 && cStart < col) {
                        result[count++] = new int[]{rStart,cStart};
                    }
                }
                //change direction
                dir = (dir + 1) % 4;
            }
            //increment stepSize to expand Spiral
            stepSize++;
        }
        return result;
    }
}
