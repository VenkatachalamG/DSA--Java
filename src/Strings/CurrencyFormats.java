// https://www.hackerrank.com/challenges/java-currency-formatter/problem

package Strings;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormats {
    public static void main(String[] args) {
        double payment = 1234.1234;
        currencyFormat(payment);
    }

    private static void currencyFormat(double payment) {
        System.out.println("US: "+NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: "+NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment));
        System.out.println("China: "+NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: "+NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}
