// https://leetcode.com/problems/guess-number-higher-or-lower/

package Arrays.Week1.SearchingArrays.Easy;

public class NumberGuess {
    private static int pickedNumber;
    public static void main(String[] args) {
        pickedNumber = 42;  // Set the number to be guessed
        int n = 100;
        int guessed = guessNumber(n);
        System.out.println();
        System.out.println("Guessed number: " + guessed);
    }
    public static int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // fallback, though the problem guarantees a solution
    }

    private static int guess(int num) {
        if (pickedNumber == num) return 0;
        return num > pickedNumber ? -1 : 1;
    }
}
