package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда цяло положително число n и печата числата от n до 1
 * в обратен ред (от най-голямото към най-малкото).
 */

public class Pr02NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
