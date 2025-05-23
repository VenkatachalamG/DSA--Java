// https://leetcode.com/problems/fair-candy-swap/

package Arrays.Arrays_Searching.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CandyShare {
    public static void main(String[] args) {
        int[] alice = {1,1}, bob= {2,2};
        int[] ans = candyShare(alice , bob);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] candyShare(int[] alice, int[] bob) {
        int sumAlice = 0, sumBob = 0;
        Set<Integer> bobSet = new HashSet<>();
        for(int val : bob)
            bobSet.add(val);
        for(int val : alice)
            sumAlice+= val;
        for(int val : bob)
            sumBob += val;
        int delta = (sumAlice - sumBob) / 2;
        for(int val : alice) {
            int candy = val - delta;
            if (bobSet.contains(candy))
                return new int[]{val, candy};
        }
        return new int[]{-1, -1};
    }
}
