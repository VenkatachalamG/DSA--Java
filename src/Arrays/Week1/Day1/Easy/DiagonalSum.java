package Arrays.Week1.Day1.Easy;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        
        int ans = diagonalSum(arr);
        System.out.println(ans);
    }

    private static int diagonalSum(int[][] arr) {
        int primarySum = primaryDiagonal(arr, 0, 0);
        int secondarySum =  secondaryDiagonal(arr, 2, 0);
        return primarySum + secondarySum - arr[arr.length / 2][arr[0]. length / 2];
    }

    private static int primaryDiagonal(int[][] arr, int row, int col) {
        int sum = 0, i = row, j = col;
        while (i < arr.length && j < arr[0].length) {
            sum += arr[i][j];
            i++;
            j++;
        }
        return sum;
    }

    private static int secondaryDiagonal(int[][] arr, int row, int col) {
        int sum = 0, i = row, j = col;
        while (i >= 0 && j < arr[0].length) {
            sum+= arr[i][j];
            i--;
            j++;
        }
        return sum;
    }
}
