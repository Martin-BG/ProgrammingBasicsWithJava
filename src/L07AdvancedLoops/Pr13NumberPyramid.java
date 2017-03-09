package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда цяло число n и отпечатва пирамида от числа
 */

public class Pr13NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int nextNum = 1;
        int lineBreak = 1;
        while (nextNum <= n) {
            for (int i = 0; i < lineBreak; i++) {
                System.out.print(nextNum++);

                if (nextNum > n) {
                    break;
                }

                if (i < lineBreak - 1) {
                    System.out.print(" ");
                }
            }

            lineBreak++;
            System.out.println();
        }
    }
}
