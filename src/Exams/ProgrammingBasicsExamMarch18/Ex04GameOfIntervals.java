package Exams.ProgrammingBasicsExamMarch18;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());

        double result = 0d;
        int range0to9 = 0;
        int range10to19 = 0;
        int range20to29 = 0;
        int range30to39 = 0;
        int range40to50 = 0;
        int invalid = 0;

        for (int i = 0; i < steps; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 0 || num > 50) {
                invalid++;
                result /= 2d;
            } else if (num < 10) {
                range0to9++;
                result += num * 0.2d;
            } else if (num < 20) {
                range10to19++;
                result += num * 0.3d;
            } else if (num < 30) {
                range20to29++;
                result += num * 0.4d;
            } else if (num < 40) {
                range30to39++;
                result += 50d;
            } else {
                range40to50++;
                result += 100d;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00%");

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %s%n", df.format((double) range0to9 / steps));
        System.out.printf("From 10 to 19: %s%n", df.format((double) range10to19 / steps));
        System.out.printf("From 20 to 29: %s%n", df.format((double) range20to29 / steps));
        System.out.printf("From 30 to 39: %s%n", df.format((double) range30to39 / steps));
        System.out.printf("From 40 to 50: %s%n", df.format((double) range40to50 / steps));
        System.out.printf("Invalid numbers: %s%n", df.format((double) invalid / steps));
    }
}
