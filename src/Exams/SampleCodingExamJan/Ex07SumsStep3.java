package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex07SumsStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] sums = {0, 0, 0};

        for (int i = 0; i < n; i++) {
            sums[i % 3] += Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("sum1 = %d%n", sums[0]);
        System.out.printf("sum2 = %d%n", sums[1]);
        System.out.printf("sum3 = %d%n", sums[2]);
    }
}
