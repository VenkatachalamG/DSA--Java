package Arrays.Week1.Day1.Easy;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int ans = numberOfGoodPairs(arr);
        System.out.println(ans);
    }

    private static int numberOfGoodPairs(int[] arr) {
        //using two loops
//        int goodPairCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j])
//                    goodPairCount++;
//            }
//        }
//        return goodPairCount;

//        using HashMap
        Map<Integer, Integer> freq = new HashMap<>();
        int goodPairCount = 0;
        for(int num : arr) {
            if (freq.containsKey(num))
                goodPairCount += freq.get(num);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return goodPairCount;
    }
}
