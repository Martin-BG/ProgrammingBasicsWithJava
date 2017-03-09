package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex10RectangleWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int size = 2 * n;

        char[] line = new char[size];

        for (int i = 0; i < size; i++) {
            line[i] = ' ';
        }

        String firstLastLine = new String(new char[size]).replace('\0', '%');

        line[0] = '%';
        line[size - 1] = '%';
        String sideLine = new String(line);

        line[n - 1] = '*';
        line[n] = '*';
        String centerLine = new String(line);

        System.out.println(firstLastLine);

        for (int i = 0; i < (n - 1) / 2; i++) {
            System.out.println(sideLine);
        }

        System.out.println(centerLine);

        for (int i = 0; i < (n - 1) / 2; i++) {
            System.out.println(sideLine);
        }

        System.out.println(firstLastLine);

    }
}
