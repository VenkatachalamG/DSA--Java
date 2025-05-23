// https://leetcode.com/problems/merge-sorted-array/description/

package Arrays.Arrays_Sorting.Easy;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {3,5,6};
        int m = 3, n = 3;
        merge(nums1,m,nums2,n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Two pointer method
//        int i = m - 1, j = n - 1;
//        int k = m + n - 1;
//
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            }
//            else {
//                nums1[k--] = nums2[j--];
//            }
//        }
//
//        while (j >= 0) {
//            nums1[k--] = nums2[j--];
//        }

        //Adding elements and then sorting the resultant array
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
