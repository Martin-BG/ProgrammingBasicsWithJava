package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex09PerfectDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int width = (n * 2) - 1;
        int spaces = 0;

        char[] charArray = new char[width];

        for (int i = 0; i < width; i++) {
            if (i < n) {
                spaces = n - 1 - i;
            } else {
                spaces++;
            }

            for (int j = 0; j < spaces; j++) {
                charArray[j] = ' ';
                charArray[width - j - 1] = ' ';
            }

            boolean star = true;
            for (int j = spaces; j < width - spaces; j++) {
                if (star) {
                    charArray[j] = '*';
                } else {
                    charArray[j] = '-';
                }
                star = !star;
            }

            System.out.println(charArray);
        }
    }
}
