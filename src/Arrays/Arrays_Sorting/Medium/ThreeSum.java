// https://leetcode.com/problems/3sum/description/

package Arrays.Arrays_Sorting.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            // check for duplicate i
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            // update j and k values based on i and n
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                // summation and two pointer logic
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    j++;
                }

                else if (sum > 0) {
                    k--;
                }

                else {
                    // add the triplet as a list and move pointers further
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    //to skip duplicates of j and k within their range based on previous j and k values
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k  && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}
