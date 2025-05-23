// https://leetcode.com/problems/missing-number/

package Arrays.Arrays_Sorting.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    private static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
                return j;
        }
        return arr.length;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
