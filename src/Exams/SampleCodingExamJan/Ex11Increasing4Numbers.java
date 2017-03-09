package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex11Increasing4Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (b - a < 3) {
            System.out.println("No");
        } else {
            int n1 = a;
            int n2 = a + 1;
            int n3 = a + 2;
            int n4 = a + 3;

            boolean found = true;
            while (found) {
                System.out.printf("%d %d %d %d%n", n1, n2, n3, n4);

                if (n4 < b) {
                    n4++;
                } else if (n3 < b - 1) {
                    n3++;
                    n4 = n3 + 1;
                } else if (n2 < b - 2) {
                    n2++;
                    n3 = n2 + 1;
                    n4 = n3 + 1;
                } else if (n1 < b - 3) {
                    n1++;
                    n2 = n1 + 1;
                    n3 = n2 + 1;
                    n4 = n3 + 1;
                } else {
                    found = false;
                }
            }
        }
    }
}
