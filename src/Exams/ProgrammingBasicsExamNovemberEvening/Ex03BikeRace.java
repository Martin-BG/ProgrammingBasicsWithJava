package Exams.ProgrammingBasicsExamNovemberEvening;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex03BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorCyclists = Integer.parseInt(scanner.nextLine());
        int veteranCyclists = Integer.parseInt(scanner.nextLine());
        String raceDiscipline = scanner.nextLine().toLowerCase();

        double income = 0;

        switch (raceDiscipline) {
            case "trail":
                income = 5.5 * juniorCyclists + 7.0 * veteranCyclists;
                break;
            case "cross-country":
                income = 8.0 * juniorCyclists + 9.5 * veteranCyclists;
                if (juniorCyclists + veteranCyclists >= 50) {
                    income *= 0.75;
                }
                break;
            case "downhill":
                income = 12.25 * juniorCyclists + 13.75 * veteranCyclists;
                break;
            case "road":
                income = 20.0 * juniorCyclists + 21.5 * veteranCyclists;
                break;
            default:
                break;

        }

        income *= 0.95;

        System.out.printf("%.2f%n", income);
    }
}
