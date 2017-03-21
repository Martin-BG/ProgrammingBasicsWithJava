package Exams.ProgrammingBasicsExamMarch18;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/480#0
 */
public class Ex01DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double sidesAndRoof = length * length;
        double rear = length / 2d * length / 2d + (length / 2d * (height - length / 2d)) / 2d;
        double front = rear - length / 5d * length / 5d;

        double redPaint = sidesAndRoof / 5d;
        double greenPaint = (sidesAndRoof + rear + front) / 3d;

        System.out.printf("%.2f%n%.2f%n", greenPaint, redPaint);
    }
}
