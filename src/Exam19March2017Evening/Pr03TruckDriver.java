package Exam19March2017Evening;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/501#2
 */
public class Pr03TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine().trim().toLowerCase();
        double tripPerMonth = Double.parseDouble(scanner.nextLine());

        double rateKm;

        if (tripPerMonth <= 5000d) {
            switch (season) {
                case "summer":
                    rateKm = 0.9d;
                    break;
                case "winter":
                    rateKm = 1.05d;
                    break;
                default:
                    rateKm = 0.75d;
                    break;
            }
        } else if (tripPerMonth <= 10000d) {
            switch (season) {
                case "summer":
                    rateKm = 1.1d;
                    break;
                case "winter":
                    rateKm = 1.25d;
                    break;
                default:
                    rateKm = 0.95d;
                    break;
            }
        } else {
            rateKm = 1.45d;
        }

        double incomeForTheSeason = tripPerMonth * 4d * rateKm * 0.9d;

        System.out.printf("%.2f%n", incomeForTheSeason);
    }
}
