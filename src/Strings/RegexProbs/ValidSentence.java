// https://www.hackerrank.com/challenges/java-string-tokens/problem

package Strings.RegexProbs;

import java.util.*;

public class ValidSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().trim();
        scan.close();

        if (!sentence.isEmpty()) {
            String[] words = sentence.split("[ !,?._'@]+");
            System.out.println(Arrays.toString(words));
            System.out.println(words.length);
            for(String word : words)
                System.out.println(word);
        }
        else {
            System.out.println("Invalid sentence");
        }
    }
}

