package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 21.02.2017.
 */
public class Ex03PointOnSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());

        if (x1 > x2) {
            int temp = x2;
            x2 = x1;
            x1 = temp;
        }

        if (x1 <= x && x <= x2) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }

        System.out.println(Math.min(getDistance(x, x1), getDistance(x, x2)));
    }

    private static int getDistance(int from, int to) {
        int distance;
        if (from == to) {
            distance = 0;
        } else if ((from <= 0 && to <= 0) || (from >= 0 && to >= 0)) {
            distance = Math.abs(from - to);
        } else {
            distance = Math.abs(from) + Math.abs(to);
        }
        return distance;
    }
}
