package Exams.ProgrammingBasicsExam7May;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/540#0
 */
public class Ex01AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskey_price = Double.parseDouble(scanner.nextLine());
        double rakia_price = whiskey_price * 0.5d;
        double whine_price = rakia_price * 0.6d;
        double beer_price = rakia_price * 0.2d;
        double beer_amount = Double.parseDouble(scanner.nextLine());
        double whine_amount = Double.parseDouble(scanner.nextLine());
        double rakia_amount = Double.parseDouble(scanner.nextLine());
        double whiskey_amount = Double.parseDouble(scanner.nextLine());

        double total_cost = whiskey_amount * whiskey_price + rakia_amount * rakia_price
                + whine_amount * whine_price + beer_amount * beer_price;

        System.out.printf("%.2f", total_cost);
    }
}
