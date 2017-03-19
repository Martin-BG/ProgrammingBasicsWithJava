package Exams.ProgrammingBasicsExamMarch18;

import java.util.Scanner;

public class Ex03CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().trim().toLowerCase();
        String carClass;
        String carType;
        double price;

        if (budget <= 100d) {
            carClass = "Economy class";
            if ("summer".equals(season)) {
                price = budget * 0.35d;
                carType = "Cabrio";
            } else {
                price = budget * 0.65d;
                carType = "Jeep";
            }
        } else if (budget <= 500d) {
            carClass = "Compact class";
            if ("summer".equals(season)) {
                price = budget * 0.45d;
                carType = "Cabrio";
            } else {
                price = budget * 0.8d;
                carType = "Jeep";
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget * 0.9d;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f%n", carType, price);
    }
}
