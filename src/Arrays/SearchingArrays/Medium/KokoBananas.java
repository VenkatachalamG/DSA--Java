package Arrays.SearchingArrays.Medium;
import java.util.Arrays;

public class KokoBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int ans = kokoBananas(piles, h);
        System.out.println(ans);
    }

    private static int kokoBananas(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        if (h == piles.length) return end;
        if (piles.length == 1) return 1;
        int ans = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long hours = findTotalHours(piles, mid);
            if (hours <= h) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static long findTotalHours(int[] piles, int mid) {
        long hour = 0;
        for(int val : piles) {
            hour += (int) Math.ceil((double) val / mid);
        }
        return hour;
    }
}
