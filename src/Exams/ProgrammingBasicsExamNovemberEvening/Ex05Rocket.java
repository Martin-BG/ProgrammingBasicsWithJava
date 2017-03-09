package Exams.ProgrammingBasicsExamNovemberEvening;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex05Rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int columns = 3 * n;

        char[] line = new char[columns];

        for (int i = 0; i < columns; i++) {
            line[i] = '.';
        }

        for (int i = 0; i < n; i++) {
            line[columns / 2 - i] = ' ';
            line[columns / 2 + i - 1] = ' ';
            line[columns / 2 - 1 - i] = '/';
            line[columns / 2 + i] = '\\';
            System.out.println(line);
        }

        for (int i = n / 2; i < columns - n / 2; i++) {
            line[i] = '*';
        }
        System.out.println(line);

        line[n / 2] = '|';
        line[columns - n / 2 - 1] = '|';

        for (int i = n / 2 + 1; i < columns - n / 2 - 1; i++) {
            line[i] = '\\';
        }

        for (int i = 0; i < n * 2; i++) {
            System.out.println(line);
        }

        for (int i = n / 2 + 1; i < columns - n / 2 - 1; i++) {
            line[i] = '*';
        }

        for (int i = 0; i < n / 2; i++) {
            line[n / 2 - i + 1] = '*';
            line[n / 2 - i] = '/';
            line[columns - n / 2 + i - 2] = '*';
            line[columns - n / 2 + i - 1] = '\\';
            System.out.println(line);
        }
    }
}
