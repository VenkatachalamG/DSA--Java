// https://leetcode.com/problems/house-robber/

package Arrays.Week1.BasicArrays.Medium;

public class RobHouses {
    public static void main(String[] args) {
        int[] arr = {5,2,3,7};
        int ans = robHouses(arr);
        System.out.println(ans);
    }

    private static int robHouses(int[] arr) {
        //DP method of storing the loots in the past houses. The decision is to take that and move to next house after skip or taking the previous house loot and skip
        int previous = 0, prevPrevious = 0;
        for(int house : arr) {
            //taking current house loot or previous to previous house loot and skipping to next house
            int loot = Math.max(previous, house + prevPrevious);
            prevPrevious = previous;
            previous = loot;
        }
        return previous;
    }
}
