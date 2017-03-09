package Exams.ProgrammingBasicsExamMarch26;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex06MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        for (int m = 1; m <= 9; m++) {
                            for (int n = 1; n <= 9; n++) {
                                if (i * j * k * l * m * n == magicNum) {
                                    System.out.printf("%d%d%d%d%d%d ", i, j, k, l, m, n);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

