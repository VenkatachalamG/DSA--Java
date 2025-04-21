package Arrays.Week1.Day1.Easy;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {34,12,45,6,12,16,22};
        String ans = oddEvenCount(arr);
        System.out.println(ans);
    }

    private static String oddEvenCount(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for(int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        return "Even Numbers : "+evenCount+"\nOdd Numbers :"+oddCount;
    }
}
