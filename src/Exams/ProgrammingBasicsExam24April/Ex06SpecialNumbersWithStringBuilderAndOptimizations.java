package Exams.ProgrammingBasicsExam24April;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/181#5
 */
public class Ex06SpecialNumbersWithStringBuilderAndOptimizations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            if (num % i != 0) {
                continue;
            }

            for (int j = 1; j <= 9; j++) {
                if (num % j != 0) {
                    continue;
                }

                for (int k = 1; k <= 9; k++) {
                    if (num % k != 0) {
                        continue;
                    }

                    for (int l = 1; l <= 9; l++) {
                        if (num % l != 0) {
                            continue;
                        }

                        stringBuilder.append(i);
                        stringBuilder.append(j);
                        stringBuilder.append(k);
                        stringBuilder.append(l);
                        stringBuilder.append(" ");
                    }
                }
            }
        }

        System.out.printf(stringBuilder.toString());
    }
}
