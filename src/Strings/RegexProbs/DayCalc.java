// https://www.hackerrank.com/challenges/java-date-and-time/problem

package Strings.RegexProbs;

import java.util.Calendar;
import java.util.Locale;

public class DayCalc {
    public static void main(String[] args) {
        int month = 8, day = 17, year = 2017;
        int ans = dayCalc(month, day, year);
        System.out.println(ans);
    }

    private static int dayCalc(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH));
        return 1;
    }
}
