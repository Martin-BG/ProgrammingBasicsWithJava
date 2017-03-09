package Exams.ProgrammingBasicsExamAugust28;

/**
 * Created by Martin on 2/26/2017.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01DailyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workDaysPerMonth = Integer.parseInt(scanner.nextLine());
        double dailyPayment = Double.parseDouble(scanner.nextLine());
        double exchangeRate = Double.parseDouble(scanner.nextLine());

        double profitPerYear = exchangeRate * 0.75 * dailyPayment * workDaysPerMonth * 14.5;

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(profitPerYear / 365));
    }
}
