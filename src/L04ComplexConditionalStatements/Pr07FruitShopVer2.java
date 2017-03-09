package L04ComplexConditionalStatements;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */
public class Pr07FruitShopVer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase().intern();
        String dayOfTheWeek = scanner.nextLine().toLowerCase().intern();
        double quantity = Double.parseDouble(scanner.nextLine());

        double[] dailyPrice = {2.50, 1.20, 0.85, 1.45, 2.70, 5.50, 3.85};
        double[] weekendPrice = {2.70, 1.25, 0.90, 1.60, 3.00, 5.60, 4.20};
        List<String> fruits = Arrays.asList("banana", "apple", "orange", "grapefruit", "kiwi", "pineapple", "grapes");
        List<String> days = Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");

        int indexPrice = fruits.indexOf(fruit);
        int indexDay = days.indexOf(dayOfTheWeek);
        boolean inputError = indexPrice < 0 || indexDay < 0;
        boolean isWeekend = indexDay >= 5;

        if (inputError) {
            System.out.println("error");
        } else {
            double price;
            if (isWeekend) {
                price = weekendPrice[indexPrice];
            } else {
                price = dailyPrice[indexPrice];
            }
            System.out.printf("%.2f%n", quantity * price);
        }
    }
}
