package Exams.SampleCodingExamJan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Martin on 21.02.2017.
 */
public class Ex01TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());

        int a = Math.abs(x2 - x3);
        int h = Math.abs(y1 - y2);

        double s = (double)(a * h) / 2d;

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(s));
    }
}
