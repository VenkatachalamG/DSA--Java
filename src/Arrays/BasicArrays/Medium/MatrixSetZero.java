// https://leetcode.com/problems/set-matrix-zeroes/

package Arrays.BasicArrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixSetZero {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1},
                {1,1,1},
                {0,1,1}};
        int[][] ans = matrixSetZero(arr);
        System.out.print("[ ");
        for(int[] row : ans)
            System.out.println(Arrays.toString(row));
        System.out.print(" ]");
    }

    private static int[][] matrixSetZero(int[][] arr) {
//        //O(n) space solution
        List<int[]> zeroSet = new ArrayList<>();
        //add the indices containing 0
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if(arr[row][col] == 0)
                    zeroSet.add(new int[]{row, col});
            }
        }
        //set the row and column of those indices to 0
        for(int[] pair : zeroSet) {
            //set row to 0
            for (int col = 0; col < arr[0].length; col++) {
                arr[pair[0]][col] = 0;
            }

            for (int row = 0; row < arr.length; row++) {
                arr[row][pair[1]] = 0;
            }
        }

        return arr;

        //O(1) space solution

//        boolean firstRowZero = false, firstColZero = false;
//        // mark first row and column for zeroing later
//        for (int i = 0; i < arr[0].length; i++) {
//            if (arr[0][i] == 0) {
//                firstRowZero = true;
//                break;
//            }
//        }
//        for (int[] ints : arr) {
//            if (ints[0] == 0) {
//                firstColZero = true;
//                break;
//            }
//        }
//        //now mark the rest of the rows and columns for zeroing
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 1; j < arr[0].length; j++) {
//                if (arr[i][j] == 0) {
//                    arr[i][0] = 0;
//                    arr[0][j] = 0;
//                }
//            }
//        }
//
//        //now turn all the rows and columns marked earlier to zero
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 1; j < arr[0].length; j++) {
//                if (arr[i][0] == 0 || arr[0][j] == 0)
//                    arr[i][j] = 0;
//            }
//        }
//
//        //now finally handle zeroing the first row and column
//        if (firstRowZero) {
//            for (int j = 0; j < cols; j++) {
//              arr[0][j] = 0;
//            }
//        }
//        if (firstColZero) {
//            for (int col = 0; col < arr.length; col++) {
//                arr[col][0] = 0;
//            }
//        }
//
//        return arr;
    }
}
