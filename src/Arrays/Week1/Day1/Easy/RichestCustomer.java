package Arrays.Week1.Day1.Easy;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,2,1}};
        int ans = richestCustomer(arr);
        System.out.println(ans);
    }

    private static int richestCustomer(int[][] arr) {
        int wealth, richest = Integer.MIN_VALUE;
        for (int[] customer : arr) {
            wealth = 0;
            for (int acc : customer) {
                wealth += acc;
            }
            richest = Math.max(wealth, richest);
        }
        return richest;
    }
}
