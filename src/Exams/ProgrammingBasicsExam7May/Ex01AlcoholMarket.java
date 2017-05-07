package Exams.ProgrammingBasicsExam7May;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/540#0
 */
public class Ex01AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double rakiaPrice = whiskeyPrice * 0.5d;
        double whinePrice = rakiaPrice * 0.6d;
        double beerPrice = rakiaPrice * 0.2d;
        double beerAmount = Double.parseDouble(scanner.nextLine());
        double whineAmount = Double.parseDouble(scanner.nextLine());
        double rakiaAmount = Double.parseDouble(scanner.nextLine());
        double whiskey_amount = Double.parseDouble(scanner.nextLine());

        double totalCost = whiskey_amount * whiskeyPrice + rakiaAmount * rakiaPrice
                + whineAmount * whinePrice + beerAmount * beerPrice;

        System.out.printf("%.2f", totalCost);
    }
}
