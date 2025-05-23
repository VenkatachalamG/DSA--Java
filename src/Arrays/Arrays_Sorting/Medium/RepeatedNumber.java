// https://leetcode.com/problems/find-the-duplicate-number/
// Note: Already solved in Medium of SearchingArrays using slow and fast pointer method. This is using cyclic sort method

package Arrays.Arrays_Sorting.Medium;

public class RepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = repeatedNumber(arr);
        System.out.println(ans);
    }

    private static int repeatedNumber(int[] arr) {
        int i = 0;
        while ( i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[correct] != arr[i]) {
                    swap(arr, correct, i);
                }
                else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
