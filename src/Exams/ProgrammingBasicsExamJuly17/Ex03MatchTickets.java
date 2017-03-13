package Exams.ProgrammingBasicsExamJuly17;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/233#2
 */
public class Ex03MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine().toLowerCase();
        int people = Integer.parseInt(scanner.nextLine());

        double transportExpences;

        if (people < 5) {
            transportExpences = 0.75;
        } else if (people < 10) {
            transportExpences = 0.6;
        } else if (people < 25) {
            transportExpences = 0.5;
        } else if (people < 50) {
            transportExpences = 0.4;
        } else {
            transportExpences = 0.25;
        }

        transportExpences *= budget;

        double ticketsCost;

        if ("vip".equals(category)) {
            ticketsCost = 499.99 * people;
        } else {
            ticketsCost = 249.99 * people;
        }

        double diff = budget - transportExpences - ticketsCost;

        DecimalFormat df = new DecimalFormat("0.00");

        if (diff < 0.0) {
            System.out.printf("Not enough money! You need %s leva.", df.format(Math.abs(diff)));
        } else {
            System.out.printf("Yes! You have %s leva left.", df.format(diff));
        }
    }
}
