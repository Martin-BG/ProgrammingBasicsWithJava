package Exams.ProgrammingBasicsExamDecember18;

import java.util.Scanner;

public class Ex05ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int columns = 4 * n + 1;
        int center = 2 * n;

        char[] line = new char[columns];

        for (int i = 0; i < columns / 2 - 1; i++) {
            line[i] = '.';
            line[columns - 1 - i] = '.';
        }

        line[center] = '|';
        line[center - 1] = '/';
        line[center + 1] = '\\';
        System.out.println(line);

        line[center - 1] = '\\';
        line[center + 1] = '/';
        System.out.println(line);

        line[center] = '*';
        line[center - 1] = '*';
        line[center + 1] = '*';

        System.out.println(line);

        for (int i = 1; i < n * 2; i++) {
            line[center - i] = '-';
            line[center - i - 1] = '*';
            line[center + i] = '-';
            line[center + i + 1] = '*';

            System.out.println(line);
        }

        for (int i = 0; i < columns; i++) {
            line[i] = '*';
        }
        String starsLine = new String(line);

        for (int i = 0; i < columns; i++) {
            if (i % 2 == 1) {
                line[i] = '.';
            }
        }

        System.out.println(starsLine);
        System.out.println(line);
        System.out.println(starsLine);
    }
}