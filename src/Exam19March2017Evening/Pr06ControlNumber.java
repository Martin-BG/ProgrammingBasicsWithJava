package Exam19March2017Evening;

import java.util.Scanner;

/**
 * Exam
 */
public class Pr06ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int totalSum = 0;

        for (int i = 1; i <= numOne; i++) {
            for (int j = numTwo; j > 0; j--) {
                totalSum += i * 2 + j * 3;
                counter++;
                if (totalSum >= controlNum) {
                    System.out.printf("%d moves%nScore: %d >= %d%n", counter, totalSum, controlNum);
                    return;
                }
            }
        }

        System.out.printf("%d moves%n", counter);
    }
}
