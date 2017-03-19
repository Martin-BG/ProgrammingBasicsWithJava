package Exams.ProgrammingBasicsExamMarch18;

import java.util.Scanner;

public class Ex06SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;

                if (1 + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, magic);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d%n", counter, magic);
    }
}
