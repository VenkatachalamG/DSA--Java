// https://leetcode.com/problems/check-if-n-and-its-double-exist/

package Arrays.Arrays_Searching.Easy;

import java.util.HashSet;
import java.util.Set;

public class NAndDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        boolean ans = nAndDoubleExists(arr);
        System.out.println(ans);
    }

    private static boolean nAndDoubleExists(int[] arr) {
        //O(n^2) complexity because of two loops
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j && arr[i] == 2 * arr[j]) {
//                    return true;
//                }
//            }
//        }

        //O(n) complexity using HashSet
        Set<Integer> ans = new HashSet<>();
        for(int num : arr) {
            //checks if a number's multiple of 2 (i.e double) or a number's factor of 2 (i.e half) exists
            if (ans.contains(num * 2) || (num % 2 == 0 && ans.contains(num / 2))) {
                return true;
            }
            ans.add(num);
        }
        return false;
    }
}
