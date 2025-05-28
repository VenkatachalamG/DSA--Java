// https://leetcode.com/problems/assign-cookies/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class AssignCookie {
    public static void main(String[] args) {
        int[] child = {1,2,3};
        int[] cookie = {1,2};

        int ans = assignCookie(child, cookie);
        System.out.println(ans);
    }

    private static int assignCookie(int[] child, int[] cookie) {
        int i = 0, j = 0, ans = 0;
        Arrays.sort(child);
        Arrays.sort(cookie);

        while ( i < child.length && j < cookie.length) {
            if (child[i] <= cookie[j]) {
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
}
