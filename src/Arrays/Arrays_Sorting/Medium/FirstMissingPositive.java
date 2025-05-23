// https://leetcode.com/problems/first-missing-positive/submissions/1640930995/

package Arrays.Arrays_Sorting.Medium;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    private static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] > 0 && arr[i] != arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1)
                return j + 1;
        }
        return arr.length + 1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
