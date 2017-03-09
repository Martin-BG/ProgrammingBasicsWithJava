package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */
public class Pr07FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase().intern();
        String dayOfTheWeek = scanner.nextLine().toLowerCase().intern();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isError = false;
        boolean isWeekend = false;

        double[] dailyPrice = {2.50, 1.20, 0.85, 1.45, 2.70, 5.50, 3.85};
        double[] weekendPrice = {2.70, 1.25, 0.90, 1.60, 3.00, 5.60, 4.20};

        int indexPrice = 0;

        switch (fruit) {
            case "banana":
                indexPrice = 0;
                break;
            case "apple":
                indexPrice = 1;
                break;
            case "orange":
                indexPrice = 2;
                break;
            case "grapefruit":
                indexPrice = 3;
                break;
            case "kiwi":
                indexPrice = 4;
                break;
            case "pineapple":
                indexPrice = 5;
                break;
            case "grapes":
                indexPrice = 6;
                break;
            default:
                isError = true;
                break;
        }

        switch (dayOfTheWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                isWeekend = false;
                break;
            case "saturday":
            case "sunday":
                isWeekend = true;
                break;
            default:
                isError = true;
                break;
        }

        if (isError) {
            System.out.println("error");
        } else {
            double totalCost;
            if (isWeekend) {
                totalCost = quantity * weekendPrice[indexPrice];
            } else {
                totalCost = quantity * dailyPrice[indexPrice];
            }

            System.out.printf("%.2f%n", totalCost);
        }
    }
}
