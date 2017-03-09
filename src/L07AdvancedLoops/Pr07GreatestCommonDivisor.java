package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда две цели положителни числа a и b и изчислява
 * и отпечатва най-големият им общ делител (НОД).
 */

public class Pr07GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int oldB;
        while (b != 0) {
            oldB = b;
            b = a % b;
            a = oldB;
        }

        System.out.println(a);
    }
}
