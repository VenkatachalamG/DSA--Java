package Arrays.Arrays_Basic.Easy;

import java.util.Arrays;

public class RotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = rotateByOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rotateByOne(int[] arr) {
        int first = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0 ; i--) {
            //shifting all elements one-by-one to last ,i.e, shifting all elements by one position to the right
            arr[i] = arr[i - 1];
        }
        //then update first element to hold the ORIGINAL LAST VALUE
        arr[0] = first;
        return arr;
    }
}
