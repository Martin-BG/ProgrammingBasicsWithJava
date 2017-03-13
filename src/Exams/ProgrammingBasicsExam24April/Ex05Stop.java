package Exams.ProgrammingBasicsExam24April;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/181#4
 */
public class Ex05Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int columns = n * 4 + 3;
        int lines = 2 * n + 2;
        int stop = n + 2;
        int sideDots = n + 1;
        int dotsStep = -1;

        String leftBorder = "//";
        String rightBorder = "\\\\";

        for (int i = 0; i < lines; i++) {
            String sides = new String(new char[sideDots]).replace('\0', '.');

            if (i == 0) {
                System.out.println(sides + new String(new char[columns - 2 * sideDots]).replace('\0', '_') + sides);
            } else if (i == stop - 1) {
                String dashes = new String(new char[(columns - 4 - 5) / 2]).replace('\0', '_');
                System.out.println(leftBorder + dashes + "STOP!" + dashes + rightBorder);
                sideDots = -1;
                dotsStep = 1;
                leftBorder = "\\\\";
                rightBorder = "//";
            } else {
                System.out.println(sides + leftBorder
                        + new String(new char[columns - 2 * sideDots - 4]).replace('\0', '_')
                        + rightBorder + sides);
            }

            sideDots += dotsStep;
        }
    }
}
