// https://leetcode.com/problems/intersection-of-two-arrays-ii/

package Arrays.Arrays_Searching.Easy;

import java.util.*;

public class ArrayIntersectionII {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2,2};
        int[] ans = arr1.length <arr2.length? arrayIntersectionII(arr1, arr2) : arrayIntersectionII(arr2, arr1);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] arrayIntersectionII(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int num : arr1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : arr2) {
            if (map1.containsKey(num) && map1.get(num) > 0) {
                result.add(num);
                map1.put(num, map1.get(num) - 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
