// https://leetcode.com/problems/third-maximum-number/description/

package Arrays.SortingArrays.Easy;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,3,5};
        int ans = thirdLargestElement(arr);
        System.out.println(ans);
    }

    static int thirdLargestElement(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            if ((first != null && num == first) || (second != null && num == second) || (third != null && num == third)) {
                continue; // skip duplicates
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long)num;
            } else if (second== null || num > second) {
                third = second;
                second = (long)num;
            } else if (third == null || num > third) {
                third = (long)num;
            }
        }
        return third == null ? first.intValue() : third.intValue();
    }

}
