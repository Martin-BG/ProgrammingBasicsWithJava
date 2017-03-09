package Exams.ProgrammingBasicsExamNovemberMorning;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex05Fox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int columns = n * 2 + 3;

        char[] line = new char[columns];

        for (int i = 0; i < columns; i++) {
            line[i] = '-';
        }

        // Top Section
        for (int i = 0; i < n; i++) {
            line[i] = '*';
            line[columns - i - 1] = '*';
            line[i + 1] = '\\';
            line[columns - i - 2] = '/';
            System.out.println(line);
        }

        // Middle section
        for (int i = 0; i < columns; i++) {
            line[i] = '*';
        }
        line[0] = '|';
        line[columns - 1] = '|';

        int middleRows = n / 3;

        for (int i = 0; i < middleRows; i++) {
            line[n / 2 + i] = '*';
            line[n / 2 + 1 + i] = '\\';
            line[columns - n / 2 - 2 - i] = '/';
            line[columns - n / 2 - 1 - i] = '*';
            System.out.println(line);
        }

        // Bottom section
        for (int i = 0; i < columns; i++) {
            line[i] = '*';
        }

        for (int i = 0; i < n; i++) {
            line[i] = '-';
            line[i + 1] = '\\';
            line[columns - 1 - i] = '-';
            line[columns - 2 - i] = '/';
            System.out.println(line);
        }
    }
}
