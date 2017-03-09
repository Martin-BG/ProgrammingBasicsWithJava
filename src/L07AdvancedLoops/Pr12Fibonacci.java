package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда цяло число n и пресмята n-тото число на Фибоначи.
 * Нулевото число на Фибоначи е 1, първото е също 1, а всяко следващо е сумата от предходните две.
 */

public class Pr12Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int numA;
        int numB = 1;
        int fibonacci = 1;

        for (int i = 2; i <= n; i++) {
            numA = numB;
            numB = fibonacci;
            fibonacci = numA + numB;
        }

        System.out.println(fibonacci);
    }
}
