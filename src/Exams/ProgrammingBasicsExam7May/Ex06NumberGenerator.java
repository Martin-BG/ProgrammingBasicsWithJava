package Exams.ProgrammingBasicsExam7May;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/540#5
 */
public class Ex06NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int specialNum = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());

        for (int i = M; i > 0; i--) {
            for (int j = N; j > 0; j--) {
                for (int k = L; k > 0; k--) {
                    int num = i * 100 + j * 10 + k;

                    if (num % 3 == 0) {
                        specialNum += 5;
                    } else if (num % 10 == 5) {
                        specialNum -= 2;
                    } else if (num % 2 == 0) {
                        specialNum *= 2;
                    }

                    if (specialNum >= controlNum) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNum);
                        return;
                    }
                }
            }
        }

        System.out.printf("No! %d is the last reached special number.", specialNum);
    }
}
