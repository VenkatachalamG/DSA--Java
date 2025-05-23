// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package Arrays.Arrays_Searching.Easy;

public class CharGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char ans = charGreaterThanTarget(letters, target);
        System.out.println(ans);
    }

    private static char charGreaterThanTarget(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        char ans = letters[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            }
            else {
                ans = letters[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}
