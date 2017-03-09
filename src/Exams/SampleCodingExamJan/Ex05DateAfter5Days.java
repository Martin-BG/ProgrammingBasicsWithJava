package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex05DateAfter5Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());

        day += 5;

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (day > days[month - 1]) {
            day -= days[month - 1];
            month++;

            if(month > 12) {
                month -= 12;
            }
        }

        System.out.printf("%d.%02d", day, month);
    }
}
