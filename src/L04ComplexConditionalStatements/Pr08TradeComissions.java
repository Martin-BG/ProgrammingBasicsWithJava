package L04ComplexConditionalStatements;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */
public class Pr08TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine().toLowerCase().intern();
        Double sells = Double.parseDouble(scanner.nextLine());

        List<String> cities = Arrays.asList("sofia", "varna", "plovdiv");
        Double[][] commissions = {
                {5.0, 7.0, 8.0, 12.0},  // Sofiq
                {4.5, 7.5, 10.0, 13.0}, // Varna
                {5.5, 8.0, 12.0, 14.5} // Plovdiv
        };

        int cityIndex = cities.indexOf(city);
        int commissionIndex;

        if (sells < 0) {
            commissionIndex = -1;
        } else if (0.0d <= sells && sells <= 500.0d) {
            commissionIndex = 0;
        } else if (500.0d < sells && sells <= 1000.0d) {
            commissionIndex = 1;
        } else if (1000.0d < sells && sells <= 10000.0d) {
            commissionIndex = 2;
        } else {
            commissionIndex = 3;
        }

        if (cityIndex < 0 || commissionIndex < 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f%n", sells * commissions[cityIndex][commissionIndex] / 100.0d);
        }
    }
}
