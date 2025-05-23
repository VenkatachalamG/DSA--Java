package Arrays.Arrays_Basic.Easy;

public class ReversePrint {
    public static void main(String[] args) {
        int[] arr = {34,12,45,6,12,16,22};
        reversePrint(arr);
    }

    private static void reversePrint(int[] arr) {
        System.out.print("[");
        for (int i = arr.length - 1;i > 0; i--) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[0]+"]");
    }
}
