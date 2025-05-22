package Arrays.BasicArrays.Easy;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {34,12,45,6,12,16,22};
        int ans = minimumElement(arr);
        System.out.println(ans);
    }

    private static int minimumElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
