package Exams.ProgrammingBasicsExam7May;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/540#1
 **/
public class Ex02ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip_cost = Double.parseDouble(scanner.nextLine());
        double puzzles = Double.parseDouble(scanner.nextLine());
        double dolls = Double.parseDouble(scanner.nextLine());
        double bears = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());

        double income = puzzles * 2.6d + dolls * 3.0d + bears * 4.1d + minions * 8.2d + trucks * 2.0d;

        if (puzzles + dolls + bears + minions + trucks >= 50) {
            income *= 0.75d;
        }

        income *= 0.9d;

        if (income >= trip_cost) {
            System.out.printf("Yes! %.2f lv left.", income - trip_cost);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", trip_cost - income);
        }
    }
}
