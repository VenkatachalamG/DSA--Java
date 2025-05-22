// https://leetcode.com/problems/intersection-of-two-arrays/

package Arrays.SearchingArrays.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1}, arr2 = {2,2};
        int[] ans = arr1.length > arr2.length? arrayIntersection(arr1,arr2) : arrayIntersection(arr2,arr1);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] arrayIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>(), result = new HashSet<>();
        for(int num : arr1) {
            set1.add(num);
        }
        for(int num : arr2) {
            if (set1.contains(num))
                result.add(num);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
