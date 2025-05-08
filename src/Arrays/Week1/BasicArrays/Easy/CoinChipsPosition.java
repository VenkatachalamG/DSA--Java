// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

package Arrays.Week1.BasicArrays.Easy;

public class CoinChipsPosition {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int ans = coinChipsPosition(arr);
        System.out.println(ans);
    }

    private static int coinChipsPosition(int[] arr) {
        //simulation approach
        int n = arr.length;
        int cost = 0;
        if(n == 1)
            return 0;
        if (n == 2) {
            return arr[n - 1] % 2 == arr[0] % 2 ? 0 : 1;
        }
        for (int i = n - 1; i > 0; i--) {
            if(arr[i] == arr[i -1])
                continue;
            else if (arr[i] % 2 != arr[i - 1] % 2)
                cost += 1;

            arr[i - 1] = arr[i];
        }
        return cost;

        //odd-even parity only approach
//        int oddParity = 0, evenParity = 0;
//        for(int coin : arr) {
//            if (coin % 2 == 0)
//                evenParity++;
//            else
//                oddParity++;
//        }
//        return Math.min(oddParity, evenParity);
    }
}
