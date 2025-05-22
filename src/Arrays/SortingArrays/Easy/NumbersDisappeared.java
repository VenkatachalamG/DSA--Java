// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

package Arrays.SortingArrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
    public static void main(String[] args) {
        int[] arr = {1,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                ans.add(j + 1);
        }
        return ans;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
