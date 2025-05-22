// https://leetcode.com/problems/single-element-in-a-sorted-array/

package Arrays.SearchingArrays.Medium;

public class SingleElementOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int ans = singleEleOccurrence(arr);
        System.out.println(ans);
    }

    private static int singleEleOccurrence(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //To point to first Occurrence of a repeating pair of element make sure mid is even
            if (mid % 2 == 1)
                mid--; //make mid even
            if (mid + 1 < arr.length && arr[mid] == arr[mid + 1])
                start = mid + 2;
            else
                end = mid - 1;
        }
        return arr[start];
    }
}
