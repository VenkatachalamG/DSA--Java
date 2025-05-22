package Arrays.BasicArrays.Easy;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {34,12,45,6,12,16,22};
        int ans = sumOfElements(arr);
        System.out.println(ans);
    }

    private static int sumOfElements(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;
    }
}
