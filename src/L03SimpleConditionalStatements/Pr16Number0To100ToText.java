package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/6/2017.
 */
public class Pr16Number0To100ToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String[] onesInEnglish = new String[]{
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen"
        };

        String[] tensInEnglish = new String[]{
                "twenty",
                "thirty",
                "forty",
                "fifty",
                "sixty",
                "seventy",
                "eighty",
                "ninety",
        };

        if ((num < 0) || (num > 100)) {
            System.out.println("invalid number");
        } else if (num < 20) {
            System.out.println(onesInEnglish[num]);
        } else if (num < 100) {
            int tens = (num / 10) - 2;
            int ones = num % 10;
            if (ones > 0) {
                System.out.printf("%s %s%n", tensInEnglish[tens], onesInEnglish[ones]);
            } else {
                System.out.println(tensInEnglish[tens]);
            }
        } else {
            System.out.println("one hundred");
        }
    }
}
