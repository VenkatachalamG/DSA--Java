package Arrays.Week1.BasicArrays.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NUniqueIntegers {
    public static void main(String[] args) {
        int n = 6;
        int[] ans = nUniqueIntegers(n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nUniqueIntegers(int n) {
        if (n == 1)
            return new int[]{0};
        Set<Integer> ans = new HashSet<>();
        int[] result = new int[n];
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < n - 1; i++) {
            int num = rand.nextInt(1, 1001);
            if (!ans.contains(num)) {
                ans.add(num);
                result[i] = num;
            }
            sum += num;
        }
        result[n - 1] = -sum;
        return result;
    }
}
