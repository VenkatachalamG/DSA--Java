package Arrays.Week1.Day1.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {4,5,5,67,12,13,12,3};
        int[] ans = elementFrequency(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] elementFrequency(int[] arr) {
        Map<Integer, Integer> freqMap =new HashMap<>();
        for(int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return Arrays.stream(freqMap.values().stream().mapToInt(Integer::intValue).sorted().toArray()).toArray();
    }
}
