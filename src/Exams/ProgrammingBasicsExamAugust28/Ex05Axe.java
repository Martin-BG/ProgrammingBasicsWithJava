package Exams.ProgrammingBasicsExamAugust28;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Ex05Axe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[] line = new char[5 * n];
        for (int i = 0; i < 5 * n; i++) {
            line[i] = '-';
        }
        line[3 * n] = '*';
        line[3 * n + 1] = '*';

        int rows = n * 2 - n % 2;
        int leftStar = n * 3;
        int rightStar = 3 * n + 1;

        for (int i = 0; i < rows; i++) {
            if (0 < i && i < n) {
                line[rightStar] = '-';
                rightStar++;
                line[rightStar] = '*';
            } else if (i == n) {
                for (int j = 0; j < 3 * n; j++) {
                    line[j] = '*';
                }
            } else if (i == n + n / 2) {
                for (int j = 0; j < 3 * n; j++) {
                    line[j] = '-';
                }
            } else if (i > n + n / 2) {
                line[leftStar] = '-';
                leftStar--;
                line[leftStar] = '*';
                line[rightStar] = '-';
                rightStar++;
                line[rightStar] = '*';
            }

            if (i == rows - 1) {
                for (int j = leftStar + 1; j < rightStar; j++) {
                    line[j] = '*';
                }
            }
            System.out.println(line);
        }
    }
}
