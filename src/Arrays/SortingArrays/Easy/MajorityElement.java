// https://leetcode.com/problems/majority-element/

package Arrays.SortingArrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    private static int majorityElement(int[] arr) {
        Map<Integer, Integer> ans = new HashMap<>();
        for(int num : arr) {
            ans.put(num, ans.getOrDefault(num, 0) + 1);
        }

        for(int num : arr) {
            if (ans.get(num) > arr.length / 2)
                return num;
        }
        return -1;

        /* Alternate approach : return the middle element of the sorted version of the array. The reason is
           that since majority element appears more than n / 2 times in an array, the middle element would
           be a majority element.
         */
        /*
            Arrays.sort(arr);
            int n = arr.length;
            return arr[n / 2];
         */

    }
}
