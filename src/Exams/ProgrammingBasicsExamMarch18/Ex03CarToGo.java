package Exams.ProgrammingBasicsExamMarch18;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/480#2
 */
public class Ex03CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal budget = new BigDecimal(scanner.nextLine());
        String season = scanner.nextLine().trim().toLowerCase();
        String carClass;
        String carType;
        BigDecimal price;

        if (budget.compareTo(new BigDecimal("100")) < 1) {
            carClass = "Economy class";
            if ("summer".equals(season)) {
                price = budget.multiply(new BigDecimal("0.35"));
                carType = "Cabrio";
            } else {
                price = budget.multiply(new BigDecimal("0.65"));
                carType = "Jeep";
            }
        } else if (budget.compareTo(new BigDecimal("500")) < 1)  {
            carClass = "Compact class";
            if ("summer".equals(season)) {
                price = budget.multiply(new BigDecimal("0.45"));
                carType = "Cabrio";
            } else {
                price = budget.multiply(new BigDecimal("0.8"));
                carType = "Jeep";
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget.multiply(new BigDecimal("0.9"));
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f%n", carType, price);
    }
}
