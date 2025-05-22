package Arrays.SearchingArrays.Easy;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(squareRoot(n));
    }

    private static int squareRoot(int n) {
        int start = 0, end = n / 2, ans = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long)mid * mid == n) {
                //if square root found, return it
                return mid;
            }
            else if (mid * mid < n) {
                //store potential ans
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        //if not perfect square, return the potential answer as it would be the correct/ closest square root
        return ans;
    }
}
