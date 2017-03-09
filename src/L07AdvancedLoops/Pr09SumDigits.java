package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда цяло число num и отпечатва сумата от цифрите му.
 */

public class Pr09SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numString = scanner.nextLine();

        int sumOfDigits = 0;

        for (int i = 0; i < numString.length(); i++) {
            sumOfDigits += numString.charAt(i) - '0';
        }

        System.out.println(sumOfDigits);
    }
}
