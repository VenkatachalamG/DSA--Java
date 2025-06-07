// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

package Strings.Easy;

public class NeedleHaystack {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        int ans = needleInHaystack(haystack, needle);
        System.out.println(ans);
    }

    private static int needleInHaystack(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String substring = haystack.substring(i, i + needle.length());
            if (substring.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
