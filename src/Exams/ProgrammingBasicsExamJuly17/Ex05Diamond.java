package Exams.ProgrammingBasicsExamJuly17;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/233#4
 */
public class Ex05Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sideDots = n;
        int sidesStep = -1;
        for (int i = 0; i < n * 3 + 2; i++) {
            String sides = new String(new char[sideDots]).replace('\0', '.');
            if (i == 0) {
                System.out.println(sides + new String(new char[5 * n - sideDots * 2]).replace('\0', '*') + sides);
            } else if (i == n) {
                System.out.println(new String(new char[5 * n]).replace('\0', '*'));
                sidesStep = 1;
            } else if (i == n * 3 + 1) {
                System.out.println(sides + new String(new char[5 * n - sideDots * 2]).replace('\0', '*') + sides);
            } else {
                System.out.println(sides + "*"
                        + new String(new char[5 * n - sideDots * 2 - 2]).replace('\0', '.')
                        + "*" + sides);
            }
            sideDots += sidesStep;
        }
    }
}
