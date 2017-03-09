package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Да се напише програма, която въвежда n и печата четните степени на 2 ≤ 2n: 20, 22, 24, 28, …, 2n.
 */

public class Pr04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        for (int i = 0; i <= n; i += 2) {
            System.out.println(num);
            num *= 4;
        }
    }
}
