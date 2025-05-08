// https://leetcode.com/problems/maximum-population-year/

package Arrays.Week1.BasicArrays.Easy;

public class PopulationChanges {
    public static void main(String[] args) {
        int[][] years = {{1993,1999},
                {2000,2010}
        };

        int ans = populationChanges(years);
        System.out.println(ans);
    }

    private static int populationChanges(int[][] years) {
        int[] population = new int[101];

        for(int[] birthDeath : years) {
            int birthYear = birthDeath[0];
            int deathYear = birthDeath[1];

            population[birthYear - 1950]++;
            population[deathYear - 1950]--;
        }

        int maxPop = 0, currPop = 0, ans = 1950;

        for (int i = 0; i < population.length; i++) {
            currPop += population[i];

            if (currPop > maxPop) {
                maxPop = currPop;
                ans = 1950 + i;
            }
        }
        return ans;
    }
}
