package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex06Sums3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a + b == c) {
            printResult(a, b, c);
        } else if (a + c == b) {
            printResult(a, c, b);
        } else if (b + c == a) {
            printResult(b, c, a);
        } else {
            System.out.println("No");
        }
    }

    private static void printResult(int a, int b, int result) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.printf("%d + %d = %d", a, b, result);
    }
}
