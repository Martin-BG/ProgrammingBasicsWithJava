package Exams.ProgrammingBasicsExamDecember18;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex03FlowersShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countHrizantemi = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countLaleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        boolean isHoliday = scanner.nextLine().toLowerCase().charAt(0) == 'y';

        double totalCost = 0;

        switch (season) {
            case "spring":
            case "summer":
                totalCost = 2.0 * countHrizantemi + 4.1 * countRoses + 2.5 * countLaleta;
                break;
            case "autumn":
            case "winter":
                totalCost = 3.75 * countHrizantemi + 4.5 * countRoses + 4.15 * countLaleta;
                break;
            default:
                break;
        }

        double discount = 1.0;
        if ("winter".equals(season) && countRoses >= 10) {
            discount = 0.9;
        } else if ("spring".equals(season) && countLaleta > 7) {
            discount = 0.95;
        }

        if (isHoliday) {
            totalCost *= 1.15;
        }

        totalCost *= discount;

        if (countHrizantemi + countRoses + countLaleta > 20) {
            totalCost *= 0.8;
        }

        totalCost += 2.0;

        System.out.printf("%.2f%n", totalCost);
    }
}
