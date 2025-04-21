package Arrays.Week1.Day1.Easy;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1};
        boolean ans = palindromeArray(arr);
        System.out.println(ans);
    }

    private static boolean palindromeArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }
}
