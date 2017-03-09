package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която чете от конзолата цяло число n и печата числата от 1 до 2n.
 */

public class Pr03PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num *= 2;
        }
    }
}
