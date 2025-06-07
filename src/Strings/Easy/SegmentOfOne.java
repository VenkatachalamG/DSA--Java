// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

package Strings.Easy;

public class SegmentOfOne {
    public static void main(String[] args) {
        String s = "110";
        boolean ans = segmentOfOne(s);
        System.out.println(ans);
    }

    private static boolean segmentOfOne(String s) {
        // count initialised to one because a single '1' is considered as a segment
        int count = 1;
        int i = 0;
        while ( i < s.length()) {
            //check if furhter segments exist, if so, increase count
            if (i > 0 && s.charAt(i) == '1' && s.charAt(i - 1) == '0') {
                count++;
            }
            i++;
        }
        return count == 1;
    }
}
