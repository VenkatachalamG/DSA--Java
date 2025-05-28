// https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=array

package Arrays.Arrays_Basic.Easy;


import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        int ans = removeElement(arr, val);
        System.out.println(ans);
    }

    private static int removeElement(int[] arr, int val) {
        if (val > 50)
            return arr.length;
        if (Arrays.stream(arr).allMatch(x -> x == val))
            return 0;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            if (arr[start] == val && arr[end] == val) {
                end--;
            }
            else if (arr[start] == val && arr[end] != val) {
                swap(arr, start, end);
            }
            else {
                start++;
            }
        }
        return end + 1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
