// https://leetcode.com/problems/create-target-array-in-the-given-order/

package Arrays.Arrays_Basic.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayCreation {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] indices = {0,1,2,2,1};

        int[] ans = targetArrayCreation(arr, indices);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] targetArrayCreation(int[] arr, int[] indices) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(indices[i], arr[i]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }


}
