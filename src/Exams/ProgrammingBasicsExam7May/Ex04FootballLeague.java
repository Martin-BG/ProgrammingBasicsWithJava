package Exams.ProgrammingBasicsExam7May;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/540#3
 */
public class Ex04FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 0; i < fans; i++) {
            switch (scanner.nextLine()) {
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
                default:
                    break;
            }
        }

        double totalFans = sectorA + sectorB + sectorV + sectorG;
        System.out.printf("%.2f%%%n", sectorA * 100.0d / totalFans);
        System.out.printf("%.2f%%%n", sectorB * 100.0d / totalFans);
        System.out.printf("%.2f%%%n", sectorV * 100.0d / totalFans);
        System.out.printf("%.2f%%%n", sectorG * 100.0d / totalFans);
        System.out.printf("%.2f%%%n", totalFans * 100.0d / capacity);
    }
}
