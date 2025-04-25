package Arrays.Week1.SearchingArrays.Easy;

public class KthMissingPositive {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int k = 2;
        int ans = kthMissingPositive(arr, k);
        System.out.println(ans);
    }

    private static int kthMissingPositive(int[] arr, int k) {
        int value = 1; //kth positive number to be returned
        int missNumber = 0; //index of missing number ,i.e, 1st missing number, 2nd missing number and so on upto Kth missing number
        int i = 0;
        while (missNumber <= k) {
            if ( i < arr.length && arr[i] == value) {
                //number exists, move on
                i++;
            }
            else {
                missNumber++; //records ith missing number index
                if (missNumber == k) //if its equal to k, we have found Kth missing positive number, return it
                    return value;
            }
            value++; //update the next missing number to check
        }
        return -1;
    }
}
