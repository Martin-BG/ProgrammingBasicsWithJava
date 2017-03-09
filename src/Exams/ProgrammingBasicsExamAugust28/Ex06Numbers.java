package Exams.ProgrammingBasicsExamAugust28;

import java.util.Scanner;

/**
 * Created by Martin on 2/27/2017.
 */
public class Ex06Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int[] digits = new int[3];
        String numString = String.valueOf(number);
        for (int i = 0; i < numString.length(); i++) {
            digits[i] = Character.digit(numString.charAt(i), 10);
        }

        int rows = digits[0] + digits[1];
        int columns = digits[0] + digits[2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (number % 5 == 0) {
                    number -= digits[0];
                } else if (number % 3 == 0) {
                    number -= digits[1];
                } else {
                    number += digits[2];
                }
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}
