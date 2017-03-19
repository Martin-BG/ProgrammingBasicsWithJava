package Exam19March2017Evening;

import java.util.Scanner;

/**
 * Exam
 */
public class Pr01GrapeAndRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double kgPerM2 = Double.parseDouble(scanner.nextLine());
        double fira = Double.parseDouble(scanner.nextLine());

        double grape = area * kgPerM2 - fira;

        System.out.printf("%.2f%n", grape * 0.45d / 7.5d * 9.8d);
        System.out.printf("%.2f%n", grape * 0.55d * 1.5d);
    }
}
