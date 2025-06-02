// https://leetcode.com/problems/count-items-matching-a-rule/description/

package Strings.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        String ruleKey = "color", ruleValue = "silver";

        int ans = countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index, count = 0;

        // Switch is a good way to find index, but could also be done with if-else-if
        switch(ruleKey) {
            case "type" :
                index = 0;
                break;
            case "color" :
                index = 1;
                break;
            case "name" :
                index = 2;
                break;
            default : return -1;
        }

        for (List<String> row : items) {
            if (row.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
