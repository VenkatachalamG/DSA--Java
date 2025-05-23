// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

package Arrays.Arrays_Sorting.Medium;

import java.util.ArrayList;
import java.util.List;

public class RepeatedNumberTwice {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        List<Integer> ans = repeatedNumberTwice(arr);
        System.out.println(ans);
    }

    private static List<Integer> repeatedNumberTwice(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1)
                ans.add(arr[j]);
        }
        return ans;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
