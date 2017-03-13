package Exams.ProgrammingBasicsExamJuly17;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/233#1
 */

public class Ex02Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal area = new BigDecimal(scanner.nextLine());
        BigDecimal harvestFromOneSqM = new BigDecimal(scanner.nextLine());
        BigDecimal neededWine = new BigDecimal(scanner.nextLine());
        BigDecimal workers = new BigDecimal(scanner.nextLine());

        BigDecimal producedWine = harvestFromOneSqM.multiply(area);
        producedWine = producedWine.multiply(new BigDecimal("0.4")
                .divide(new BigDecimal("2.5"), 2, BigDecimal.ROUND_HALF_UP));

        if (neededWine.compareTo(producedWine) == 1) {
            System.out.printf("It will be a tough winter! More %d liters wine needed.%n",
                    neededWine.subtract(producedWine).intValue());
        } else {
            System.out.printf("Good harvest this year! Total wine: %d liters.%n", producedWine.toBigInteger());
            System.out.printf("%d liters left -> %d liters per person.%n",
                    producedWine.subtract(neededWine).setScale(0, RoundingMode.UP).intValue(),
                    producedWine.subtract(neededWine).divide(workers, 2, BigDecimal.ROUND_HALF_UP)
                            .setScale(0, RoundingMode.UP).intValue());
        }
    }
}