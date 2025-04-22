package Arrays.Week1.BasicArrays.Medium;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 3;
        int[] ans = rotateArray(arr, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rotateArray(int[] arr, int k) {
//        not in-place rotation
//        int[] ans = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            ans[(i + k) % arr.length] = arr[i];
//        }
        //in-place sorting
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        return arr;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
