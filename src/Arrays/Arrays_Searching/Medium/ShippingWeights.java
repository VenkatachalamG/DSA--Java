// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

package Arrays.Arrays_Searching.Medium;

import java.util.Arrays;

public class ShippingWeights {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = shippingWeights(weights, days);
        System.out.println(ans);
    }

    private static int shippingWeights(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt();
        int end = Arrays.stream(weights).sum();

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isSmallestCap(weights, days, mid)) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }

    private static boolean isSmallestCap(int[] weights, int days, int mid) {
        int noOfDays = 1;
        int totalWeight = 0;

        for(int weight : weights) {
            if (totalWeight + weight > mid) {
                noOfDays++;
                totalWeight = 0;
            }
            totalWeight += weight;
        }
        return noOfDays <= days;
    }
}
