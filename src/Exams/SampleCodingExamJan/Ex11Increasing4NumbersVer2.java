package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex11Increasing4NumbersVer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (b - a < 3) {
            System.out.println("No");
        } else {
            for (int i = a; i <= b - 3; i++) {
                for (int j = i+1; j <= b - 2; j++) {
                    for (int k = j+1; k <= b - 1; k++) {
                        for (int l = k+1; l <= b; l++) {
                            System.out.printf("%d %d %d %d%n", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
