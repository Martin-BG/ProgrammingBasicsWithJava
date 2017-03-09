package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex12GenerateRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (int left = -n; left <= n; left++) {
            for (int top = -n; top <= n; top++) {
                for (int right = left + 1; right <= n; right++) {
                    for (int bottom = top + 1; bottom <= n; bottom++) {
                        int area = (right - left) * (bottom - top);
                        if (area >= m) {
                            System.out.printf("(%d, %d) (%d, %d) -> %d%n", left, top, right, bottom, area);
                            found = true;
                        }
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No");
        }
    }
}
