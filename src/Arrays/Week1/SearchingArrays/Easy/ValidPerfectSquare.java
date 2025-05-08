// https://leetcode.com/problems/valid-perfect-square/

package Arrays.Week1.SearchingArrays.Easy;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = validPerfectSquare(n);
        System.out.println(ans);
    }

    private static boolean validPerfectSquare(int n) {
        if (n == 0 || n == 1) return true;
        //non-searching method
//        long i = 2;
//        while (i * i <= n) {
//            if (i * i == n)
//                return true;
//            i++;
//        }
//        return false;

        //searching method
        long start = 1, end = n / 2;
        if (n < 2) return true;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == n)
                return true;
            else if (mid * mid < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
