// https://leetcode.com/problems/contains-duplicate/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {0};
        boolean ans = duplicateNumber(arr);
        System.out.println(ans);
    }

    private static boolean duplicateNumber(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        for(int num : arr) {
            if (ans.contains(num))
                return true;
            ans.add(num);
        }
        return false;
    }


}
