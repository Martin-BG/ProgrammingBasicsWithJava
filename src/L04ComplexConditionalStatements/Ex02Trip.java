package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/11/2017.
 */
public class Ex02Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        String destination = "Bulgaria";
        String sleepAt = "Hotel";
        double cost = 0.0d;

        if (budget <= 100.0d) {
            // Bulgaria
            if ("summer".equals(season)) {
                cost = budget * 0.3d;
                sleepAt = "Camp";
            } else {
                cost = budget * 0.7d;
            }
        } else if (budget <= 1000.0d) {
            // Balkans
            destination = "Balkans";
            if ("summer".equals(season)) {
                cost = budget * 0.4d;
                sleepAt = "Camp";
            } else {
                cost = budget * 0.8d;
            }
        } else {
            // Europe
            destination = "Europe";
            cost = budget * 0.9d;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", sleepAt, cost);
    }
}
