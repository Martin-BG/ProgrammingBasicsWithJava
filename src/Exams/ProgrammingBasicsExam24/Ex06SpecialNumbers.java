package Exams.ProgrammingBasicsExam24;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex06SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((num % i == 0) && (num % j == 0) && (num % k == 0) && (num % l == 0)) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
