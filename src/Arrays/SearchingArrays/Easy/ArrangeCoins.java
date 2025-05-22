// https://leetcode.com/problems/arranging-coins/

package Arrays.SearchingArrays.Easy;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 12;
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }

    private static int arrangeCoins(int n) {
        int count = 0, row = 1;
        while (n >= row) {
            n -= row;
            row++;
            count++;
        }
        return count;
    }
}
