// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPatterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine().trim());
        while (testCases-- > 0) {
            String pattern = in.nextLine();
            checkPattern(pattern);
        }
        in.close();
    }

    private static void checkPattern(String pattern) {
        try {
            Pattern.compile(pattern);
            System.out.println("\nValid");
        }
        catch(PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}
