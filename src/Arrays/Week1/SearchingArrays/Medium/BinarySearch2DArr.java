package Arrays.Week1.SearchingArrays.Medium;

public class BinarySearch2DArr {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6}};
        int target = 0;
        boolean ans = binarySearch2DArr(arr, target);
        System.out.println(ans);
    }

    private static boolean binarySearch2DArr(int[][] arr, int target) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int n = rowLen * colLen;
        int[] oneArr = new int[n];
        for (int i = 0; i < n; i++) {
            oneArr[i] = arr[i / colLen][i % colLen];
        }
        return binarySearch(oneArr, target);
    }

    static boolean binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
