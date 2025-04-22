package Arrays.Week1.BasicArrays.Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {43,12,35,67,7,81,19};
        int ans = secondLargestElement(arr);
        System.out.println(ans);
    }

    private static int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;

            }
            else {
                if (num > secondMax && num != max)
                    secondMax = num;
            }
        }
        return secondMax;
    }
}
