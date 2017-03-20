package Exam19March2017Evening;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/501#3
 */
public class Pr04Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0d;

        for (int i = 0; i < months; i++) {
            electricity += Double.parseDouble(scanner.nextLine());
        }

        double water = months * 20d;
        double internet = months * 15d;
        double other = (water + electricity + internet) * 1.2;
        double averagePerMonth = (electricity + water + internet + other) / months;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv%n", averagePerMonth);
    }
}
