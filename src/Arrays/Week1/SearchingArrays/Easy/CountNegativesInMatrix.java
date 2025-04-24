package Arrays.Week1.SearchingArrays.Easy;

public class CountNegativesInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};
        int ans = countNegativesInMatrix(arr); //approach using binary search
        int ans2 = countNegativesMatrixTwo(arr); // O(n + m) linear approach
        System.out.println(ans2);
    }

    private static int countNegativesMatrixTwo(int[][] arr) {
        int row = arr.length - 1, col = 0, count = 0;
        while (row >= 0 && col < arr[0].length) {
            if (arr[row][col] < 0) {
                count += arr[0].length - col ;
                row--;
            }
            else {
                col++;
            }
        }
        return count;
    }

    private static int countNegativesInMatrix(int[][] arr) {
        int count = 0;
        for(int[] row : arr) {
            int start = 0, end = row.length - 1;
            count += binarySearch(row, start, end);
        }
        return count;
    }

    static int binarySearch(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < 0) {
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return arr.length - start;
    }
}
