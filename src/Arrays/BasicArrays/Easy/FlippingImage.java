// https://leetcode.com/problems/flipping-an-image/

package Arrays.BasicArrays.Easy;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flippingImage(arr);
        for(int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] flippingImage(int[][] arr) {
        for(int[] row : arr) {
            swap(row, 0, row.length - 1);
        }
        return arr;
    }

    private static void swap(int[] row, int start, int end) {
        while (start <= end) {
            int temp = row[start] ^ 1;
            row[start] = row[end] ^ 1;
            row[end] = temp;
            start++;
            end--;
        }
    }
}
