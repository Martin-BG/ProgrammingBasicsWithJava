package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex04PointInFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if ((x >= 2d && x <= 12d && y >= -3d && y <= 1d) || (x >= 4d && x <= 10d && y >= -5d && y <= 3d)) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
    }
}
