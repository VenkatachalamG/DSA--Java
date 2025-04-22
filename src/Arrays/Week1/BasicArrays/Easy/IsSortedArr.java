package Arrays.Week1.BasicArrays.Easy;

public class IsSortedArr {
    public static void main(String[] args) {
        int[] arr = {3,45,67,12,230,14,78,43};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
