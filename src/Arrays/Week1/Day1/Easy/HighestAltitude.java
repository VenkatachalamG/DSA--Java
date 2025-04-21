package Arrays.Week1.Day1.Easy;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        int ans = highestAltitude(arr);
        System.out.println(ans);
    }

    private static int highestAltitude(int[] arr) {
        int altitude = 0, maxAlt = 0;
        for(int gain : arr) {
            altitude += gain;
            maxAlt = Math.max(altitude, maxAlt);
        }
        return maxAlt;
    }
}
