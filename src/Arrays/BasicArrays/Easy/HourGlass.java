package Arrays.BasicArrays.Easy;

public class HourGlass {
    public static void main(String[] args) {
        int[][] arr = {
                {-9 ,-9 ,-9  ,1 ,1 ,1},
                {0 ,-9  ,0  ,4 ,3 ,2},
                {-9 ,-9, -9,  1, 2, 3},
                {0  ,0  ,8  ,6 ,6 ,0},
                {0  ,0,  0, -2, 0, 0},
                {0  ,0  ,1  ,2 ,4 ,0}
        };
        int ans = hourglassSum(arr);
        System.out.println(ans);
    }

    private static int hourglassSum(int[][] arr) {
        int sum, max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                sum = computeHourglassSum(arr, row, col);
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }

    private static int computeHourglassSum(int[][] arr, int row, int col) {
        int sum = 0;
        //calculate sum here
        for (int i = col; i <= col + 2; i++) {
            sum += arr[row][i];
        }

        sum += arr[row + 1][col + 1];

        for (int i = col; i <= col + 2; i++) {
            sum += arr[row + 2][i];
        }

        return sum;
    }
}
