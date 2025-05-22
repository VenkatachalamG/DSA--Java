package Arrays.SearchingArrays.Medium;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    private static int findDuplicate(int[] arr) {
        if (arr.length == 2) {
            return arr[0] == arr[1] ? arr[0] : -1;
        }

        int slow = 0, fast = 0;
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
