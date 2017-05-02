package Exams.ProgrammingBasicsExam24April;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/181#5
 */
public class Ex06SpecialNumbersWithStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((num % i == 0) && (num % j == 0) && (num % k == 0) && (num % l == 0)) {
                            stringBuilder.append(i);
                            stringBuilder.append(j);
                            stringBuilder.append(k);
                            stringBuilder.append(l);
                            stringBuilder.append(" ");
                        }
                    }
                }
            }
        }

        System.out.printf(stringBuilder.toString());
    }
}
