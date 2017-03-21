package Exams.ProgrammingBasicsExamMarch18;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/480#1
 */
public class Ex02WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int manHours = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int actualWorkTime = workers * days * 8;

        int overtime = actualWorkTime - manHours;

        if (overtime < 0) {
            System.out.printf("%d overtime%nPenalties: %d%n", -overtime, -overtime * days);
        } else {
            System.out.printf("%d hours left%n", overtime);
        }
    }
}
