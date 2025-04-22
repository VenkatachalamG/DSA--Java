package Arrays.Week1.BasicArrays.Easy;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,45,67,12,230,14,78,43};
        int ans = largestElement(arr);
        System.out.println(ans);
    }

    private static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }
}
