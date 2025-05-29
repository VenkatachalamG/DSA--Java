// https://leetcode.com/problems/relative-sort-array/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.*;

public class RelativeSort {
    public static void main(String[] args) {
        int[] arr = {28,6,22,8,44,17}, arr2 = {22,28,8,6};
        int[] ans = relativeSort(arr, arr2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] relativeSort(int[] arr, int[] arr2) {
        Map<Integer, Integer> ans = new LinkedHashMap<>();
        List<Integer> notNums = new ArrayList<>();

        //add all the elements of arr2 as keys
        for(int num : arr2) {
            ans.put(num, 0);
        }

        //count duplicate frequencies of arr2 elements
        for(int num : arr) {
            // if number present in hashmap, add it to result
            if (ans.containsKey(num)) {
                ans.put(num, ans.getOrDefault(num, 0) + 1);
            }
            else {
                // if not add the number to a separate list
                notNums.add(num);
            }
        }

        int[] res = new int[arr.length];
        int k = 0;

        // add them in relative order in new result
        for (int num : ans.keySet()) {
            int count = ans.get(num);
            for (int i = 0; i < count; i++) {
                res[k++] = num;
            }
        }

        // sort numbers to be added at last in ascending order and add it to result
        Collections.sort(notNums);
        for(int num : notNums) {
            res[k++] = num;
        }
        return res;
    }
}
